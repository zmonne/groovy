//methods é o nome para função no groovy
def printHello(){
    println "Hello World"
}
printHello()

def sum(int a, int b=5){
    println "The sum is "+(a+b)
    def result = a+b
    return result
}

sum(1,2)
println '---'
sum(1)