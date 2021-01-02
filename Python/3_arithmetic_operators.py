# Given 2 numbers (a and b) received from input, 
# which are in an included range of 1 and 10 power 10,
# print on one line the result of adding them, substracting a to b and multiplying them.
if __name__ == '__main__':
    a = int(input())
    b = int(input())
    if (1 <= a and a <= (10 ** 10)) and (1 <= b and b <= (10 ** 10)):  # Constraint a and b between 1 and 10 power 10
        print(a + b)
        print(a - b)
        print(a * b)