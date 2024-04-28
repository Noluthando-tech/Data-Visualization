import matplotlib.pyplot as plt 
import pandas as pd

foot_ball=pd.read_csv("C:/Users/27728/Downloads/dataset - 2020-09-24.csv")
print(foot_ball.head())
print(foot_ball.duplicated().sum())
print(foot_ball.isnull().sum())
print(foot_ball.dtypes)
print(foot_ball.size)
print(foot_ball.columns)
print(foot_ball.shape)
print(foot_ball.info())

plt.scatter(foot_ball['Age'], foot_ball['Appearances'],color='navy',alpha=1,s=30)
plt.xlabel('Age')
plt.ylabel('Appearances')
plt.title('A Scatter Plot that shows the relationship between Players Age  the and their appearances ')
plt.show()