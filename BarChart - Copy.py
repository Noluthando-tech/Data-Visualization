import pandas as pd
import matplotlib.pyplot as plt


Name= ['William Saliba', 'Bernd Leno', 'Rob Holding', 'David Luiz']
Appearances= [25, 35, 20, 30]


plt.figure(figsize=(6, 6))  
plt.bar(Name, Appearances)
plt.xlabel('Name')
plt.ylabel('Appearances')
plt.title('Name vs Appearance')
plt.grid(True)  
plt.show()


