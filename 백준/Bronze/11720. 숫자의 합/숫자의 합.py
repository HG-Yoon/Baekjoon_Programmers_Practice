import sys

n = int(sys.stdin.readline())
s = sys.stdin.readline().rstrip()

total = sum(int(ch)for ch in s)

sys.stdout.write(str(total)+'\n')
