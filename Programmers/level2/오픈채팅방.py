def solution(record):
    answer = []
    temp = []
    user = {}
    for text in record :
        li = text.split(" ")
        
        if li[0] == "Enter" :
            nickname = li[2]
            userid = li[1]     
            user[userid] = nickname
            temp.append(userid+" 들어왔습니다.")
        
        if li[0] == "Leave":
            temp.append(li[1] +" 나갔습니다.")
        
        if li[0] == "Change" :
            userid = li[1]
            nickname = li[2]
            user[userid] = nickname
            
    for value in temp :
        split_value = value.split(" ")
        nickname = user[split_value[0]]
        answer.append(nickname + "님이 " + split_value[1])

    return answer
