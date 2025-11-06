import sys

input = sys.stdin.readline
print = sys.stdout.write

l, p = map(int, input().split())
arr = list(map(int, input().split()))
ans_arr = []
for i in range(5):
    ans_arr.append(arr[i]-l*p)

print(' '.join(map(str, ans_arr)))
