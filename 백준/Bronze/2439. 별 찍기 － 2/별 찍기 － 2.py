import sys

n = int(sys.stdin.readline())

for i in range(n):
    sys.stdout.write(' '*(n-1-i)+'*'*(i+1)+'\n')
