# ============================
# Assignment1: Simple Linear Regression
# ============================

import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression

# 1. Store data
x = np.array([1, 2, 3, 4, 5]).reshape(-1, 1)  # Feature (hours of advertising)
y = np.array([10, 20, 30, 40, 50])  # Target (units sold)

# 2. Train Linear Regression Model
model = LinearRegression()
model.fit(x, y)

# 3. Predictions
pred_6 = model.predict([[6]])
pred_8 = model.predict([[8]])

# 4. Get slope (m) and intercept (c)
m = model.coef_[0]
c = model.intercept_

print("===== Assignment1 Results =====")
print("Slope (m):", m)
print("Intercept (c):", c)
print("Prediction for 6 hours:", pred_6[0])
print("Prediction for 8 hours:", pred_8[0])

# 5. Visualization
plt.scatter(x, y, color="red", label="Actual Data")
plt.plot(x, model.predict(x), color="blue", label="Regression Line")
plt.xlabel("Hours of Advertising per Week")
plt.ylabel("Units Sold")
plt.title("Assignment1: Sales Prediction using Linear Regression")
plt.legend()
plt.show()


# ============================
# Assignment2: Multiple Linear Regression with State Encoding
# ============================

import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import LabelEncoder

# 1. Load dataset from Excel file
data = pd.read_excel("50_Startups.xlsx")   # 👈 Use your Excel file name
print("\nFirst 5 rows:\n", data.head())

# 2. Select X (independent) and y (dependent)
X = data[["State"]]    # Independent variable (State)
y = data["Profit"]     # Dependent variable (Profit)

# 3. Encode 'State' column
le = LabelEncoder()
X_encoded = le.fit_transform(X["State"])
X_encoded = X_encoded.reshape(-1, 1)

# 4. Train-test split (80% train, 20% test)
X_train, X_test, y_train, y_test = train_test_split(X_encoded, y, test_size=0.2, random_state=42)

# 5. Train Linear Regression model
model2 = LinearRegression()
model2.fit(X_train, y_train)

# 6. Predictions
y_pred = model2.predict(X_test)

# Display actual vs predicted
comparison = pd.DataFrame({"Actual Profit": y_test.values, "Predicted Profit": y_pred})
print("\n===== Assignment2 Results =====")
print("Actual vs Predicted Profits:\n", comparison)

# 7. Visualization
plt.scatter(X_test, y_test, color="red", label="Actual Profits")
plt.scatter(X_test, y_pred, color="blue", marker="x", label="Predicted Profits")
plt.xlabel("State (Encoded)")
plt.ylabel("Profit")
plt.title("Assignment2: Profit Prediction using State only")
plt.legend()
plt.show()
