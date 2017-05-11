enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }

fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
            setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
            else -> throw Exception("Dirty color")
        }

// так я написал, если бы не нашел пример)
fun mix_my(c1: Color, c2: Color) =
    when (c1){
        Color.RED -> if(c2 == Color.YELLOW) Color.ORANGE else throw Exception("Dirty color")
        Color.YELLOW -> if(c2 == Color.RED) Color.ORANGE else if(c2 == Color.BLUE) Color.GREEN else throw Exception("Dirty color")
        Color.BLUE -> if(c2 == Color.YELLOW) Color.GREEN else if(c2 == Color.VIOLET) Color.INDIGO else throw Exception("Dirty color")
        Color.VIOLET -> if(c2 == Color.BLUE) Color.INDIGO else throw Exception("Dirty color")
        else -> throw Exception("Dirty color")
    }



fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
    println(mix(Color.YELLOW,Color.RED))
    println(mix_my(Color.YELLOW,Color.RED))
}