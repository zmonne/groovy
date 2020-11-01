//CLOSURES, acredito que é equivalente a PARAMETERS em Fortran
def myFistClosure = {println "Hello World"}
def mySecondClosure = {name -> println "Hello $name"}
//Declaração de variáveis para CLOSURES pode ser externo ao bloco de código
def aux1 = "Hello"
def myThirdClosure = {name -> println "$aux1 $name"}
//CLOSURE.call()
myFistClosure.call()
mySecondClosure.call("Zmonne")
myThirdClosure.call("Zmonne")
println '---'
//Ao contrário em METHODS, a declaração e variáveis deve pertercem ao bloco de código, no entanto, existe a possibilidade de "by-pass"
def myMethod(clos){
    clos.call("Groovy")
}
myMethod(myThirdClosure)
println '---'
def myFourthClosure = {
    a,b,c ->
    return (a+b+c)
}
println myFourthClosure(10,20,30)
//Expandido o universo de aplicações, com emprego de manipuladores 
def myList = [1,2,3,4,5]
println myList.find {item -> item > 2}
println myList.findAll {item -> item > 2}
println myList.any {it > 3}
println myList.every {item -> item > 3}
//Destaque de operação
println myList.collect {item -> item*10}
