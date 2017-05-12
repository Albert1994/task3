package Person

open class Person(val name: String): Comparable<Person> {
    var age:Int = 0
    var isAdult = false

    constructor(name: String, age: Int) : this(name) {
        if (age > 0) {
            this.age = age
            this.isAdult = this.age in 21..100
        } else
            println("Неправильный возраст")
    }

    override fun compareTo(other: Person): Int {
        if(this.age > other.age) return 1
        else if (this.age < other.age) return  -1
        return 0
    }

    fun funage(other: Person) {
        if(this.age > other.age) println(this.name + " старше")
        else if (this.age < other.age) println(other.name + " старше")
        else println(this.name + " и "+ other.name + " старше")
    }

    override fun toString():String{
        var str = ""
        if(this.age != 0){
            str = "Имя: " + this.name + "\nвозраст: " + this.age + "\nвзрослый?" + this.isAdult + "\n_____"
        }else{
            str = "Имя " + this.name
        }

        return str
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Person) return false
        return other.age == age
    }


}

data class database(val name: String,val age: Int, val isAdult: Boolean)



class Teenager(name: String) : Person(name){
    var isTeenager = false

    constructor(name: String, age: Int) : this(name){
        if(age > 0) {
            this.age = age
            this.isTeenager = this.age in 13..19
        }else
            println("Не правильный возраст")
    }
}

fun main(args: Array<String>){
    var lord = Person("Толик")
    var lord2 = Person("Петя", 50)
    var lord3 = Person("Антон", 45)
    var lord4 = Person("Слава", 17)
    var teenager = Teenager("Максим", 21)

    println(teenager.isTeenager)


    println(lord2.toString())
    println(lord3.toString())
    println(lord.toString())

    lord4.funage(lord3)
    if(lord2.compareTo(lord3) == 1){
        println(lord2.name + " старше")
    }

    if(lord2 > lord3)println("yes")
    if(lord3 == lord3)println("yes")
}
