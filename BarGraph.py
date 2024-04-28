import matplotlib.pyplot as plt
import pandas as pd


foot_ball=pd.read_csv("C:/Users/27728/Downloads/dataset - 2020-09-24.csv")

print(foot_ball.head())
print(foot_ball.size)
print(foot_ball.tail())
print(foot_ball.dtypes)
print(foot_ball.columns)
print(foot_ball.shape)
print(foot_ball.info())
print(foot_ball.duplicated().sum())
print(foot_ball.isnull().sum())


plt.bar(foot_ball['Age'],foot_ball['Appearances'])
plt.xlabel=('Age')
plt.ylabel=('Appearances')
plt.title("The bar graph that shows the relationship between the Age and the Appearance of the players ")
plt.show()
