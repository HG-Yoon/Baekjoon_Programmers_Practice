month = int(input())
day = int(input())

if month == 1:
    print("Before")
elif month == 2 and day < 18:
    print("Before")
elif month == 2 and day == 18:
    print("Special")
elif month == 2 and day > 18:
    print("After")
elif month >= 3:
    print("After")
