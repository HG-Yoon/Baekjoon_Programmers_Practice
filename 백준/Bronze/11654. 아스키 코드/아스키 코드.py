n = input()
if n >= 'a' and n <= 'z':
    print(ord(n))
elif n >= 'A' and n <= 'Z':
    print(ord(n))
elif int(n) >= 0 and int(n) <= 9:
    print(ord(n))
