# 별도 라이브러리 필요없이 리스트 사용하면 됨

stack = []

stack.append(3)
stack.append(2)
stack.append(5)
stack.pop()

print(stack)
# reverse 출력
print(stack[::-1])

# 큐(Queue) 구현위해 deque 라이브러리 사용. 
from collections import deque

queue = deque()

queue.append(3)
queue.append(2)
queue.append(1)
queue.popleft()

print(queue)
queue.reverse()
print(queue)
