import sys

a, b = map(int, sys.stdin.readline().split())
c, d = map(int, sys.stdin.readline().split())

# 첫 번째 바구니 사과:a, 오렌지:b
# 두 번째 바구니 사과:c, 오렌지:d
# 첫 번째 바구니는 사과만, 두 번째 바구니는 오렌지만 있게 하는 경우
move_1 = b+c
# 첫 번째 바구니는 오렌지만, 두 번째 바구니는 사과만 있게 하는 경우
move_2 = a+d
ans = min(move_1, move_2)
sys.stdout.write(str(ans))
