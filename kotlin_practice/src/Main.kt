import kotlin.math.max
import java.util.*

fun main() {

    val const_num = 10 // val -> const
    var name = "sik"

    var i = 10
    var j = 20

    val items = arrayOf(1,2,3) // add 불가
    var itemsList = mutableListOf(1,2,3,4,5)

    var nullVar : String? = null

    val sik = Person(name = "sik", age=28)

    items.set(0, 0)

    itemsList.add(6)

    nullVar?.let{ // null check
        nullVar = "hi"
    }

    println(nullVar)

    for(item in items){
        println(item)
    }

    for(index in 0  ..  (itemsList.size-1)){
        println(index)
    }

    when{
        i > 10 ->{
            println("i is bigger than 10")
        } i > 5 ->{
            println("i is bigger than 5")
        } else ->{
            println("i is less than 5")
        }
    }

    var result = when{
        i > 10 ->{
            println("i is bigger than 10")
        } i > 5 ->{
            println("i is bigger than 5")
        } else ->{
            println("i is less than 5")
        }
    }

    fun sum(a: Int, b: Int): Int{
        return a+b
    }

    fun sum2(a: Int, b: Int): Int = a + b

    println(result)

    println(const_num)
    println(name[0]) // index 접근 가능

    println("hi " + name + "님") // +로 문자열 결합 가능
    println("hi $name") // $로 변수명 사용 가능

    println(max(i, j))

    println(if (i>10) true else false)




}

class Person(
    val name: String,
    var age: Int
)

abstract class Animal{
    open fun move(){
    }
}

class Dog: Animal(){
    override fun move(){

    }
}

suspend fun concFunc(a: Int, callBack: () ->Unit){
    println("concFunc() Start")
    callBack()
    println("concFunc() Finish")
}