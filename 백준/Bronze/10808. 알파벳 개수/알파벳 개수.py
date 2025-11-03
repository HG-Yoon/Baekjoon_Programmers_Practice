import sys


def main():
    S = sys.stdin.readline().strip()
    count = [0] * 26

    for c in S:
        count[ord(c) - ord('a')] += 1

    print(' '.join(map(str, count)))


if __name__ == "__main__":
    main()
