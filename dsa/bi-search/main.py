sArray:list = [1, 2, 3, 4, 5, 6, 7, 8, 9]

def biSearch(sArr:list, targ:int):
    r = len(sArr) - 1
    l = 0
    while r >= l:
        # remember that the midpoint is relative, and not set from the start, meaning that the start
        # moves to be 'l', and then you can perform standard mp flooring
        m = l + (r - l) // 2
        if m == sArr[targ]:
            return targ
        elif targ > sArr[m]:
            l = m + 1 # as you have explored the mid and are moving the left ro the right... so you must add 1
        else:
            r = m - 1 # as you have explored the mid and are moving the right ro the left... so you must subtract 1
    return -1

if __name__ == "__main__":
    sArr:list[str] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
    x:int = 5
    r = biSearch(sArr, x)

    if r == -1:
        print(f"Target {x} not found in array")
    else:
        print(f"found target {x} in array")
