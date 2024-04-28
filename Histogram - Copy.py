import pandas as pd 
import matplotlib. pyplot as plt

foot_ball=pd.read_csv("C:/Users/27728/Downloads/dataset - 2020-09-24.csv")
print(foot_ball.duplicated().sum())
print(foot_ball.isnull().sum())
print(foot_ball.info())

print(foot_ball.shape)
print(foot_ball.dtypes)
print(foot_ball.size)
print(foot_ball.tail())


print(foot_ball.columns)




plt.hist(foot_ball['Age'] ,bins=10)
plt.xlabel('Ages')
plt.ylabel('Goals Per Player')
plt.title('A Histogram that shows the relationship between the age and the goals scored by each player')
plt.show()
