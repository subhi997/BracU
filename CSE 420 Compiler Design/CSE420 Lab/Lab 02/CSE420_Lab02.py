print("Please enter the no. of input")
n = int(input())
list_line = []

alphabet = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
digit = [0,1,2,3,4,5,6,7,8,9]
other = [".","-","_"]

for n in range(n):
    print("Enter an input")
    line = input()
    list_line.append(line)

for i in range(n):
#Validate Email address
  for element in list_line:
    def validateEmail():
#to check if "@" is present in email
            def state1():
                if "@" in element: return True
                else: return False
#split at @
            if state1() == True:
                x = element.split("@")
                first_part = x[0]
                last_part = x[1]

#to check if email starts with alphabet character
                y = list(first_part)
                firstChar = y[0]
                def state2():
                    if firstChar in alphabet: return True
                    else: return False

#to check atleast one "." present in email
                def state3():
                    if "." not in last_part: return False
                    else: return True
#to check if email ends with an alphabet character
                z = list(last_part)
                lastChar = z[-1]
                def state4():
                    if lastChar in alphabet: return True
                    else: return False

            if state1()==True and state2()==True and state3()==True and state4()==True:
                return True
            else: return False
    if validateEmail()==True:
        e_valid = list_line.index(element) + 1
        print("Email,",e_valid)
#Validate Web address
    def validateWeb():
#check starting convention
            def Wstate1():
                 strElement = str(element)
                 if "www" in strElement: return True
                 elif "https://" in strElement: return True
                 elif "http://" in strElement: return True
                 elif "smtp://" in strElement: return True
                 else: return False

#check number of "." in web address convention
            def Wstate2():
                 if Wstate1() == True:
                    substring = "."
                    count = element.count(".")
                    if count >= 2: return True
                    else: return False

            def Wstate3():
                 p = list(element)
                 if p[-1] in alphabet: return True
                 else: return False
            def Wstate4():
                if "@" in element:
                    return False
                else: return True
            if Wstate1()==True and Wstate2()==True and Wstate3()==True and Wstate4():
                return True
            else: return False
    if validateWeb()==True:
        w_valid = list_line.index(element) + 1
        print("Web,",w_valid)


























