import re

print("Please enter the no. of RegEx input")
n = int(input())
r_list = []
for n in range(n):
    print("Enter a RegEx input")
    r_input = input()
    r_list.append(r_input)

print("Please enter the no. of Pattern input")
k = int(input())
p_list = []
for k in range(k):
    print("Enter a pattern input")
    p_input = input()
    p_list.append(p_input)

for item in p_list:
    flag = False
    check = 0
    count = len(r_list)
    for element in r_list:
        x = re.compile(element)
        y = r_list.index(element)
        y += 1
        def match():
            if re.fullmatch(x, item):
                return True
            else:
                return False

        if match() == True:
            flag = True
            print("YES,",y)
        else:
            if check<count:
                check += 1
                if check == count:
                    print("No,",0)
                else:
                    continue
        if flag:
            break







