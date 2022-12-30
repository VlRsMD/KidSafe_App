import pyqrcode
import png
from pyqrcode import QRCode

import random_text
import rsa_encryption

s = rsa_encryption.rsa_enc()
url = pyqrcode.create(s)
url.svg("QR_Code.svg", scale=8)
url.png('QR_Code.png', scale=6)