# -*- coding: utf-8 -*-
"""
Created on Tue Feb 22 14:40:07 2022

@author: fud37
"""

# Counter : 등장 횟수를 세는 기능 제공
# 리스트와 같은 반복 가능한(iterale) 객체가 주어졌을 때 
# 내부의 원소가 몇 번씩 등장했는지 알려줌

from collections import Counter

counter = Counter(['red', 'blue', 'red', 'green', 'blue', 'blue'])

print(counter['blue']) # 'blue'가 등장한 횟수
print(counter['green']) # 'green'이 등장한 횟수
print(dict(counter)) # 사전 자료형으로 반환