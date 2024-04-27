import matplotlib.pyplot as plt
import numpy as np


data = np.random.normal(9 ,1, 100)  



plt.figure(figsize=(6, 6))  
plt.boxplot(data)
plt.xlabel('Losses')
plt.ylabel('Wins')
plt.title('Losses vs Wins in Box Plot ')
plt.grid(True)  
plt.show()
