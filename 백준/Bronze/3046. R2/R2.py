import sys

input = sys.stdin.readline
print = sys.stdout.write

r1, s = map(int, input().split())
r2 = 2*s-r1
print(str(r2))
