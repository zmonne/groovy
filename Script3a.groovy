/*
Demonstra o range de operação para cada tipo de objeto numérico.
*/
//byte
//Tipo de objeto byte, seu range de -128 até 127, muito interessante para redução de consumo da dados, e incremento de performance, compreendo seu valor, mas me foge sua aplicação prática, "lista de opções"?
byte a = 50
byte b = 25
byte c
c = a + b
println c + '\n'
println Byte.MIN_VALUE
println Byte.MAX_VALUE + '\n'
//short
println Short.MIN_VALUE
println Short.MAX_VALUE + '\n'
//int
println Integer.MIN_VALUE
println Integer.MAX_VALUE + '\n'
//long
println Long.MIN_VALUE
println Long.MAX_VALUE + '\n'
//float
println Float.MIN_VALUE
println Float.MAX_VALUE + '\n'
//double
println Double.MIN_VALUE
println Double.MAX_VALUE + '\n'

def e = (byte) 10
println e
println e.class.Name
println "---"

def f = 10
println f
println f.class.Name

/* Nota de aprofundamento:
-sintaxe no VS, utilizando a extensão do Marlon, sugere diferença de emprego, ao comparar com o Eclipse. 
*/