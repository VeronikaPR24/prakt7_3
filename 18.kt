fun main(){
    try{
        println("введите точку M1:")
        val x1 = readln()!!.toDouble()
        val y1 = readln()!!.toDouble()
        println("введите точку M2:")
        val x2 = readln()!!.toDouble()
        val y2 = readln()!!.toDouble()
        println("введите точку N1:")
        val x3 = readln()!!.toDouble()
        val y3 = readln()!!.toDouble()
        println("введите точку N2:")
        val x4 = readln()!!.toDouble()
        val y4 = readln()!!.toDouble()
        val parallel = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4)
        val t1 = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / parallel
        val t2 = ((x1 - x3) * (y1 - y2) - (y1 - y3) * (x1 - x2)) / parallel
       when{
           parallel == 0.0 -> println("параллельные прямые")
           else -> println("точки пересечения:$t1, $t2")
       }
    }catch(e:Exception){
        println("неверный формат данных")
    }
}