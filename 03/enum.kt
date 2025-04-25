// enum class

fun main() {

    println(Direction.WEST)
    Direction.values().forEach {
        println(it)
    }


    val direction = Direction.EAST

    when(direction){
        Direction.NORTH->{
            println("N")
        }
        Direction.EAST->{
            println("E")
        }
        Direction.SOUTH->{
            println("S")
        }
        Direction.WEST->{
            println("WEST")
        }
    }

    val color = Color.RED
    when(color){
        Color.RED->{
            println("red")
        }
        Color.BLUE->{
            println("blue")
        }
        Color.GREEN->{
            println("green")
        }
    }

//    val device = Device
//    val device = Device
    println(Device.NETWORK.status)
    Device.NETWORK.status ="ON"
    println(Device.NETWORK.status)

}
enum class Device(var status:String){
    NETWORK("OFF")
}

enum class Color(val rgb:Int){
    RED(0xFF0000),
    BLUE(0x0000FF),
    GREEN(0x00FF00)
}

enum class Direction{
    NORTH, SOUTH, WEST, EAST
}

enum class CustomerType{
    A,B,C,D
}