import math
import os
import random
import re
import sys

# Get a number (int) from input, if is not in inclusive range of 1 and 100 then do nothing,
# otherwise, if the number is odd print "Weird", 
# "Not Weird" if the number is even lower than 6, "Weird" if the number is even and between 6 and 20,
# and "Not Weird" if it is even greater than 20.

if __name__ == '__main__':
    n = int(input())
    if 1 <= n and n <= 100:  # Between 1 and 100 inluded
        if n % 2 or (not(n % 2) and (6 <= n and n <= 20)):  # Odd or even between 6 and 20 included
            print('Weird')
        else:  # Even lower than 6 or greater than 20
            print('Not Weird')