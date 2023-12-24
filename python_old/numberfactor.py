from math import *
def factor(n):
    factors = []

    for i in range(2, int(sqrt(n)) + 1):
        while (n % i == 0): 
            factors.append(i)
            n //= i

    if n > 1 : factors.append(n) 
    
    return factors

test = 90
ls = factor(test)[:]

print(ls)
m = 1
for i in range(len(ls)):
    m *= ls[i]
print(m == test)