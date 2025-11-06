import sys

a, b, c = map(int, sys.stdin.readline().split())

if a == b and a == c and b == c:
    sys.stdout.write(str(10000+a*1000))
elif (a == b and a != c) or (a == c and a != b):
    sys.stdout.write(str(1000+a*100))
elif b == c and b != a:
    sys.stdout.write(str(1000+b*100))
elif a != b and a != c and b != c:
    sys.stdout.write(str(max(max(a, b), c)*100))
