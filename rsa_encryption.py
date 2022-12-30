import rsa
import random_text

publicKey, privateKey = rsa.newkeys(512)
def rsa_enc():
    message = random_text.rndm_text()
    encMessage = rsa.encrypt(message.encode('UTF-8'), publicKey)
    s = ''.join(map(chr,encMessage))
    return s
