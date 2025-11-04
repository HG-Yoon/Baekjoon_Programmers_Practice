import sys

while True:
    s = sys.stdin.readline().strip()
    if s == "#":
        break
    else:
        lower_s = s.lower()
        ans = lower_s.count('a') + lower_s.count('e') + \
            lower_s.count('i') + lower_s.count('o') + lower_s.count('u')
        sys.stdout.write(str(ans) + '\n')
