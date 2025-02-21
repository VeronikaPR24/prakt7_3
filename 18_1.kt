import kotlin.math.sqrt

fun main() {
    try{
        println("введите сторону равностороннего треугольнка = ")
        val st = readln()!!.toDouble()
        when(st){
            0.0 -> println("сторона не можеть равняться нулю")
        }
        val S = st * st * (sqrt(3.0))/ 4
        val radV = st * (sqrt(3.0))/6
        val radO = st / (sqrt(3.0))
        println("площадь = $S, радиус вписанного треугольника = $radV, радиус описанного треугольника = $radO")
    }catch(e:Exception){
        println("неверный формат данных")
    }
}