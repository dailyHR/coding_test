# 순열과 조합 : itertools 라이브러리 사용
# 순열
from itertools import permutations

data = ['A', 'B' ,'C'] # 모든 순열 구하기

result = list(permutations(data, 3))
print(result)

# 조합
from itertools import combinations

result = list(combinations(data, 2))
print(result)

# 중복 순열
from itertools import product

result = list(product(data, repeat=2))
print(result)

# 중복 조합
from itertools import combinations_with_replacement

result = list(combinations_with_replacement(data,2))
print(result)
