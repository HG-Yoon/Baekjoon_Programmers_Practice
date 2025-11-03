import sys

while (True):
    s = sys.stdin.readline().rstrip()
    if s == "END":
        break
    sys.stdout.write(s[::-1]+'\n')
