fun main(args: Array<String>){

   args.sortDescending()
    for(d in args){
        val a = fu(d)
        if(a != null){
            println(a)
        }
    }
}

fun  fu(d: String): String? {
    var count = 0
    for(s in d) {
        count++
    }
    if(count > 3)
        return d
    else return null
}