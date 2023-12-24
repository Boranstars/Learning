a = [i * 1100 + j * 11 for i in range(10) for j in range(10)  if (not (i == j) and ((i * 1100 + j * 11)  in [k**2 for k in range(100)] ))]
for i in a :
    print(f"%0.4d"% i)
    
    