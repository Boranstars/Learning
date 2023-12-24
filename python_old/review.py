#if语句
isTrue = False
if isTrue:
    print('True')
else:
    
    print(isTrue)

#类定义
class TestClass():
    def __init__(self) -> None:
        pass

class Point(object):
    
    def __init__(self, posX = 0, posY = 0) -> None:
        self._posX = posX
        self._posY = posY
    def __str__(self):
        return f"({self._posX},{self._posY})"
    
    def set_pos(self, cord):
        self._posX , self._posY= cord
        
    def get_pos(self):
        return self._posX ,self._posY
    cord = property(get_pos,set_pos)
p1 = Point()
p1.cord = 1, 2
print(p1.cord)

#相等判断
s1 = "aaa"
s2 = "aaa"
print(s1 == s2)
