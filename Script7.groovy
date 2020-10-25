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