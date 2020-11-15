def fruits = ["Maças","Laranjas","Uvas"]
println fruits[1]
println fruits.get(0)

def myList = [1,2,3,['A','B',"Groovy"],4]
println myList[3][2]
println myList.get(3).get(1)
println myList[3][0..1]

println myList[3].contains('B')
println myList[3].size()

myList.add(10)
println myList

println myList<<20

myList.pop()
println myList