def solution(s):
    answer = 0
    leng = len(s)//2
    minValue = 1000
    for i in range(1, leng+1):
        temp = []
        for j in range(0,len(s),i):
            temp.append(s[j:j+i])
        for j in range(len(temp)) :
            k = 1
            while j+k < len(temp) and temp[j] == temp[j+k]:
                temp[j+k] = ' '
                k += 1
            if(k != 1):
                temp[j] = str(k) + temp[j]
        result = ''
        for m in temp :
            if not ' ' in m :
                result += m
        minValue = min(len(result), minValue)
    if len(s) == 1 :
        answer = 1
    else :
        answer = minValue
    return answer
