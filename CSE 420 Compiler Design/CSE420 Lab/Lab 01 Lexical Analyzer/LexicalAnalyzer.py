import re
import nltk

input_program = open("input.txt").read()
tokens = nltk.wordpunct_tokenize(input_program)

RE_Keywords = "if|else|int|float|double|char|break|continue|for|do|return"
RE_Identifiers = "^[a-zA-Z_]+[a-zA-Z0-9_]*"
RE_Numerals = "[0-9]+\.[0-9]+|^(\d+)$|^(\d*\.)?\d+$"
RE_LogicalOperators = "(<)|(>)|(<=)|(>=)"
RE_MathOperators = "(\++)|(-)|(=)|(\*)|(/)|(%)|(--)"
RE_Others = "(,)|(:)|(;)|({)|(})|(()|())"


#^(\d+)$
#To save the tokens
list_keywords = []
list_identifiers = []
list_numerals = []
list_logicalOperators = []
list_mathOperators = []
list_others = []

#To Categorize The Tokens
for token in tokens:
    if(re.findall(RE_Keywords,token)):
        list_keywords.append(token)
    elif(re.findall(RE_MathOperators,token)):
        list_mathOperators.append(token)
    elif(re.findall(RE_Numerals,token)):
        list_numerals.append(token)
    elif(re.findall(RE_LogicalOperators,token)):
        list_logicalOperators.append(token)
    elif(re.findall(RE_Identifiers,token)):
        list_identifiers.append(token)
    elif (re.findall(RE_Others, token)):
        list_others.append(token)
    else:
        print("Unknown Value")

#Remove Duplicate
def my_function(x):
    return list(dict.fromkeys(x))
list_keywords = my_function(list_keywords)
list_identifiers = my_function(list_identifiers)
list_mathOperators = my_function(list_mathOperators)
list_logicalOperators = my_function(list_logicalOperators)
list_numerals = my_function(list_numerals)
list_others = my_function(list_others)

#Print Output
#* To print elements inside a list

print("Keywords:", *list_keywords, sep=",")
print("Identifiers:", *list_identifiers, sep=",")
print("Math Operators:", *list_mathOperators, sep=",")
print("Logical Operators:", *list_logicalOperators, sep=",")
print("Numerical Values:", *list_numerals, sep=",")
print("Others:", *list_others)

