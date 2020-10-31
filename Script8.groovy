def name = "Fábio"
println name
println "My name is "+name
println "My name is $name"
println "My name is ".concat(name)
print '\n'
//Nota 1
println 'My name is $name'
//Nota 2
//Observe, que não apenas permite a inserção do texto na quebra de linha, mas também, esta quebra é interpretada pelo copilador, e replicada "as is".
def aux_text = """Permite uma
organização
adequada do texto"""
println aux_text
println '---'
println name.length()
println name[2]
println name.indexOf('F')
println name[0..2]
println name[4..2]
println name[1,4]
println '---'
println aux_text.split("\n")
println aux_text-("uma")
println aux_text.replace("organização","configuração")
println name.toUpperCase()
println name.toList()
println name*3
println '---'
println name.equals("fábio")
//Redobrar a atenção, comandos no Groovy também são case sensitives
println name.equalsIgnoreCase("fábio")
println '---'
println $/Olá mundo!/$
//Há diferenciação quanto a limitações
def mensagem = /Olá mundo!/
println mensagem