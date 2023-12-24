import time
while 1:
    localtime = time.asctime(time.localtime(time.time())) 

    if input("当前时间") == " ":
        print(str(localtime) +"\n")