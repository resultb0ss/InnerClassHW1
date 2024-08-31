fun main() {
    var humanJoe = Human("Joe")

    println(humanJoe.toString())

    println("------------------")
    humanJoe.Head().say()
    println(humanJoe.Head().toString())

    println("----------------")
    humanJoe.Legs().go()
    println(humanJoe.Legs().info())
}