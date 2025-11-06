import sys

n = int(sys.stdin.readline())

for i in range(n):
    sys.stdout.write('*'*(n-i)+"\n")
