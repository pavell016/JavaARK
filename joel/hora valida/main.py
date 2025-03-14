hores = int(input())
minuts = int(input())
segons = int(input())
if hores > 23 or hores < 0 or minuts > 59 or minuts < 0 or segons > 59 or segons < 0:
    print("NO")
else:
    print("SI")