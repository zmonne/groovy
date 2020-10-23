//Conditional Statements
def num = 11
if (num == 10) {
    println "num is 10"
}
else {
    println "num is not 10"
}

def x = 10
def result = ""

switch (x) {
    case {x>0}:
        result = "x is positive number"
        break
    case {x<0}:
        result = "x is a negative number"
        break
    default:
        result = "x is zero" 
}
 println "$result"
