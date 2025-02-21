fun main() {
    try{
        println("введите коэффициенты: ")
        val a = readln()!!.toDouble()
        when(a){
            0.0 -> {
                println("a не должно быть равно 0")
                return
            }
        }
        val b = readln()!!.toDouble()
        val c =  readln()!!.toDouble()
        val x = -b / (2 * a)
        val y = a * x * x + b * x + c
        println("вершины параболы = $x и $y")
    }catch(e:Exception){
        println("неверный формат данных")
    }
}
