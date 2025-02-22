fun main(){
    try{
        println("введите координаты точки")
        val x = readln()!!.toDouble()
        val y = readln()!!.toDouble()
        val a = x in -3.0..1.0 && y in -1.0..1.0
        when{
            a -> println("точка принадлежит графику a")
            else -> println("точка НЕ принадлежит графику a")
        }
        val b = x in -1.0..1.0 && y in -2.0..2.0
        when{
            b -> println("точка принадлежит графику б")
            else -> println("точка НЕ принадлежит графику б")
        }
        val c = x in -1.0..1.0 && y in -1.0..2.0
        when{
            c -> println("точка принадлежит графику в")
            else -> println("точка НЕ принадлежит графику в")
        }
        val d = x in -2.0..1.0 && y in -2.0..1.0
        when{
            c -> println("точка принадлежит графику г")
            else -> println("точка НЕ принадлежит графику г")
        }
    }catch(e:Exception){
        println("неверный формат данных")
    }
}