import sys

input = sys.stdin.readline
print = sys.stdout.write

l = int(input())
a = int(input())
b = int(input())
c = int(input())
d = int(input())

kor_days = (a+c-1)//c
math_days = (b+d-1)//d

ans = l-max(kor_days, math_days)
print(str(ans))
