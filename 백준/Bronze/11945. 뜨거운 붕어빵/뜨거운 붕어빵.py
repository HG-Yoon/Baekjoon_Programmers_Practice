import sys

n, m = map(int, sys.stdin.readline().split())
for i in range(n):
    s = sys.stdin.readline().strip()
    sys.stdout.write(s[::-1]+'\n')
