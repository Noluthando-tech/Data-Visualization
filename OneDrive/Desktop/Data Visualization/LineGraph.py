import matplotlib.pyplot as plt
import pandas as pd

foot_ball=pd.read_csv("C:/Users/27728/Downloads/dataset - 2020-09-24.csv")

plt.plot(foot_ball['Age'],foot_ball['Appearances'])
plt.xlabel('Age')
plt.ylabel('Appearances')
plt.title('The line graph that show the relationship between the age and the appearances of the players')
plt.show()

