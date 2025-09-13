from sklearn.neighbors import KNeighborsClassifier
from sklearn.model_selection import train_test_split
from sklearn.datasets import load_iris
from sklearn.metrics import accuracy_score

#Demo test
from sklearn.neighbors import KNeighborsClassifier

from sklearn.model_selection import train_test_split

from sklearn.datasets import load_iris

from sklearn.metrics import accuracy_score

# Load dataset

iris = load_iris()

X, y = iris.data, iris.target

# Split dataset into training and testing sets

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)

# Initialize the KNN classifier with k=3

knn = KNeighborsClassifier(n_neighbors=3)

# Train the model

knn.fit(X_train, y_train)

# Make predictions

y_pred = knn.predict(X_test)

# Evaluate the model

accuracy = accuracy_score(y_test, y_pred)

print(f"Accuracy: {accuracy * 100:.2f}%")

print("\n---\n")


# --- Custom apple/orange data section ---

# Load iris dataset
iris = load_iris()
X, y = iris.data, iris.target

# Split dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)

# Initialize the KNN classifier with k=3
knn = KNeighborsClassifier(n_neighbors=3)

# Train the model
knn.fit(X_train, y_train)

# Make predictions
y_pred = knn.predict(X_test)

# Evaluate the model
accuracy = accuracy_score(y_test, y_pred)
print(f"Iris dataset accuracy: {accuracy * 100:.2f}%")

# --- Custom apple/orange data section ---
# Features: [roundness, sweetness]
custom_X = [
    [7, 8],  # apple
    [6, 7],  # apple
    [3, 5],  # orange
    [2, 4],  # orange
]
custom_y = [0, 0, 1, 1]  # 0=apple, 1=orange

# Train on custom data
custom_knn = KNeighborsClassifier(n_neighbors=3)
custom_knn.fit(custom_X, custom_y)

# Test data (your own samples)
test_data = [
    [6, 8],  # likely apple
    [2, 5],  # likely orange
]
test_labels = [0, 1]  # actual labels for accuracy check

# Predict and evaluate
custom_pred = custom_knn.predict(test_data)
custom_accuracy = accuracy_score(test_labels, custom_pred)
print(f"Custom apple/orange accuracy: {custom_accuracy * 100:.2f}%")
print(f"Predictions for test data: {custom_pred}")  # 0=apple, 1=orange
# Predictions for test data: [0 1] indicates first is apple, second is orange




