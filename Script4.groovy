/*
Comando assert interrompe o programa no momento em que observa o erro lógico.
*/

//Normal Operators
assert 1+2==3
assert 2**3==8
assert -(-1)==1

//Unary Operators
assert +3==3
//assert +('3')==3

//Increment Operators
Integer a = 0
Integer i = 1
a = i++
assert a == 1
assert i == 2

//Repetindo o processo anterior com alteração simbólica.
a = 0
i = 1
a = ++i 
assert a == 2
assert i == 2

//Decrement Operators
def e = 10
def f = e--
assert e == 9
assert f == 10
//Assignment arithmetic operators
def c = 5
c += 3
assert c == 8

def j=3
j**=3
assert j==27


//Relational Operators
assert 1 != 2
assert 1 == 1
assert 1 <= 2

//Logical Operators
assert true || false
assert true && true
assert !false && true

//Bitwise Operators
int g = 0b001
int h = 0b101
l = g + h
println l
