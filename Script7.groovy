try{
int i = 1/0
}
catch(ArithmeticException exp1){
    println "Bloco de exceção para exceção aritimética"
}
catch(Exception exp){
    println "Estou dentro do bloco de exceção amplo"
    println exp.getCause()
    println exp.getMessage()
}
finally{
    println "Estou no bloco final do do bloco de exceção"
}
println "Estou fora do bloco de exceção"
println "---"+'\n'
//Exec1
    try{
        int num1 = 1/0
    }catch(Exception exp){
        println "I am inside exception block"
        println "Exception is "+exp
    }
//Exec5
    try{
        int num2 = 1/0
//Deste exercício notamos que a ordem de precedência afeta o resultado da saída
    }catch(Exception exp2){
        println "I am inside exception block"
    }catch(ArithmeticException exp3){
        println "I am inside block to catch arithmetic exception"
    }
    finally{
        println "I am inside finally block"
    }
    println "I am outside exception"