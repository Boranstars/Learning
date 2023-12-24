import math
class Myclass:
    def __init__(self,msg:str) -> None:
        self.msg = msg
    def __repr__(self) -> str:
        return f'Myclass({self.msg!r})'
    def __str__(self) -> str:
        return f'Myclass({self.msg!r})'

class Vector:
    def __init__(self,x = 0 ,y = 0) -> None:
        self.x = x
        self.y = y
    def __abs__(self):
        return math.hypot(self.x,self.y)
    def __repr__(self) -> str:
        return f'Vector({self.x!r},{self.y!r})'
    def __add__(self,other):
        return Vector(self.x+other.x,self.y+other.y)
    def __mul__(self,factor = 1):
        return Vector(self.x * factor, self.y * factor)
    def __bool__(self):
        return bool(abs(self))
if __name__ == "__main__":
    # cls = Myclass(111)
    # print(repr(cls))
    # print(cls)
    v1 = Vector(3,4)
    v2 = Vector(7,8)
    print(v1*3)