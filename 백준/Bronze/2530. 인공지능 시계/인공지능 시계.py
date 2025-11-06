import sys

input = sys.stdin.readline
print = sys.stdout.write

a, b, c = map(int, input().split())
d = int(input())

current_time_s = a*3600+b*60+c
finish_time = current_time_s+d

finish_time_h = (finish_time//3600) % 24
finish_time_m = (finish_time % 3600)//60
finish_time_s = finish_time % 60

times = [finish_time_h, finish_time_m, finish_time_s]
print(' '.join(map(str, times))+'\n')
