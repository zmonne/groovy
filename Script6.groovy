//for
for ( int i=1; i<5; i++){
    println "M1_$i"
}
for (a in 1..5) {
    println "M2_$a"
}
for (j in [0,1,2,3,4]){
    println "M3_$j"
}
//for com map + print
def map = ["name":"groovy", "subject":"automation"]
for (l in map){
    print l.key
    println l.value
}   
//upto
1.upto(5){
    println "upto_$it"
}
//times
5.times{ println "times_$it"}
//step
1.step(10,2){
    println "step_$it"
}
//while
int k=1
while (k<5){
    println "while_$k"
    k = k + 1
}
//exercício 1.8
    z = 0
    for ( w in [0, 1, 2, 3, 4] ) {
        z += w
    }
    println "Resposta p/ exec. 8: $z"
//exercício 2.2
    def m=0
    def n=5
    while (n-- >0){
        m++
    }
    println "Valor final de M = $m"