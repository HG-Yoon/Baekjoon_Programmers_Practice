import sys

input = sys.stdin.readline
print = sys.stdout.write

a = list(map(int, input().split()))
a.sort()
a_str = list(map(str, a))
print(' '.join(a_str))
