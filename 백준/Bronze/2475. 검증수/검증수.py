numbers = list(map(int, input().split()))
sum = 0
for num in numbers:
    sum += num*num

print(sum % 10)
