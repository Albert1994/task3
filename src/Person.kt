/**
 * Created by Альберт on 10.05.2017.
 */


class Person(val name: String){
    var age:Int = 0
    var isAdult = 0

    constructor(name: String, age: Int) : this(name){
        if(age > 0)
        this.age = age
        else
        println("Не правильный возраст")
    }

    fun print_Person():String{
        var str = ""
        if(this.age != 0){
            str = "Имя: " + this.name + "\nвозраст: " + this.age.toString() + "\n_____"
        }else{
            str = "Имя " + this.name
        }

        return str
    }

}

fun main(args: Array<String>){
    var lord = Person("Lord")
    var lord2 = Person("Lord2", 2)


    println(lord2.print_Person())
    println(lord.print_Person())


}