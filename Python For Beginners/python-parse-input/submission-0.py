from typing import List

def read_integers() -> List[int]:
    user_input = input()
    up = user_input.split(",")
    res = []
    for c in up:
        res.append(int(c))
    return res

# do not modify the code below
print(read_integers())
print(read_integers())
print(read_integers())
