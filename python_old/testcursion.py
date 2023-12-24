import time

def factorial1(n):
    if n == 1:
        return 1
    else:
        return n * factorial1(n-1)

def factorial2(n):
    result = n
    for i in range(1,n):
        result *= i
    return result  

print(factorial2(1000))