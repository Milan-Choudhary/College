import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.metrics import accuracy_score, precision_score, recall_score, classification_report

# 1. Create dataset
data = {
    'height_cm': [170, 165, 180, 160, 175, 155, 185, 168],
    'weight_kg': [70, 55, 85, 50, 78, 48, 90, 60],
    'foot_size_cm': [28, 24, 30, 23, 29, 22, 31, 25],
    'gender': ['Male', 'Female', 'Male', 'Female', 'Male', 'Female', 'Male', 'Female']
}
df = pd.DataFrame(data)
df['gender'] = df['gender'].map({'Male': 1, 'Female': 0})

X = df[['height_cm', 'weight_kg', 'foot_size_cm']]
y = df['gender']

# 2. Split data
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)

# 3. Train model
model = GaussianNB()
model.fit(X_train, y_train)

# 4. Predictions
y_pred = model.predict(X_test)

# 5. Metrics
print(f"Accuracy: {accuracy_score(y_test, y_pred):.2f}")
print(f"Precision (Male): {precision_score(y_test, y_pred, pos_label=1):.2f}")
print(f"Recall (Male): {recall_score(y_test, y_pred, pos_label=1):.2f}")

print("\nClassification Report:")
print(classification_report(y_test, y_pred, target_names=['Female', 'Male']))

# 6. New samples
new_sample = [[160, 48, 21], [180, 55, 30], [140, 46, 28]]
new_sample_df = pd.DataFrame(new_sample, columns=['height_cm', 'weight_kg', 'foot_size_cm'])
predicted_class = model.predict(new_sample_df)
print(f"Predicted class for new sample: {predicted_class}")
