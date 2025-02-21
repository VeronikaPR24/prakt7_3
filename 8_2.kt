fun main() {
    try{
        println("введите числа:")
        val a = readln()!!.toDouble()
        val b = readln()!!.toDouble()
        val c = readln()!!.toDouble()
        when{
            a <= 0 || b <= 0 || c <= 0 -> {
                println("числа не могут быть меньше нуля")
                return
            }
        }
        val P = a + b + c
        val S = a * b * c
        println("площадь = $S, периметр = $P")
    }catch(e:Exception){
        println("неверный формат данных")
    }
}