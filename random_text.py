import random

limit = 255

def rndm_text():
    random_str = ''
    for _ in range(8):
        random_int = random.randint(0, limit)
        random_str += (chr(random_int))
    return random_str