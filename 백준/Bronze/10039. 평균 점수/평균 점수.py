scores = []
sum = 0
for i in range(5):
    scores.append(int(input()))

for score in scores:
    if score >= 40:
        sum += score
    else:
        sum += 40

avg = sum//5
print(avg)
