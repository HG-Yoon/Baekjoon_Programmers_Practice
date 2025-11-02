n = int(input())
numbers = list(map(int, input().split()))

v = int(input())
cnt = 0
for num in numbers:
    if num == v:
        cnt += 1

print(cnt)
