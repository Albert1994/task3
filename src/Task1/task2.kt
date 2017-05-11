fun main(args: Array<String>){
    for(d in args){
        try {
            val a = fuctio(d)
            println(a)
        }
        catch (e: NumberFormatException){
            println(e)
        }
    }
}

fun  fuctio(d: String): Int {
    val al = d.toInt()
    return al
}
