'''
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
and return an array of the non-overlapping intervals that cover all the intervals in the input.

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
'''
def merge(lol):
    lol.sort(key= lambda i: i[0]) #  [[1,3],[2,6]...]
    output = [lol[0]]

    for start,end in lol[1:] :
        lastEnd = output[-1][1]
        if start<=lastEnd :
            output[-1][1] = max(lastEnd,end)
        else :
            output.append([start,end])

    s = ""
    for i in output:
        i = [str(x) for x in i]
        a = " ".join(i)
        s+=a+" "
    return s

n = int(input())
lst = list(map(int,input().split()))  # [1 3 2 6 8 10 15 18]
lol = []
i=0
while i<2*n : # i goes from 0 to 2n-1
    interval = []
    interval.append(lst[i])
    interval.append(lst[i+1]) #[i,i+1]
    i+=2
    lol.append(interval)

ans = merge(lol)
print(ans)

