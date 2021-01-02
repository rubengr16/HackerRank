from __future__ import division
# Given 2 numbers(a and b) from stdin print in one line the integer division and in other the float one.
if __name__ == '__main__':
    a = int(input())
    b = int(input())
    print(a // b)  # integer division returns integer rounded to the floor
    print(a / b)  # float divirion returns a float