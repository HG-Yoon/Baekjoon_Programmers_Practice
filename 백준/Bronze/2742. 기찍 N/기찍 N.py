import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

for i in range(n, 0, -1):
    print(str(i)+'\n')
