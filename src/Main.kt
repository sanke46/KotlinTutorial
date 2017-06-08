import java.util.*

/**
 * Created by ilafedoseev on 08.06.17.
 */

fun main(args : Array<String>) {

    var nullVar: String? = null

    fun returNull(): String? {
        return null
    }

    var nullVar2 = returNull()
    if(nullVar2 != null){
        println("nullVar2.lenght")
    }

    var nullVar3 = nullVar2!!.length
    var nullVal4: String = returNull()?: "No Name"



// Classes
    val bowser = Animal("Bowser", 20.0, 13.5)
    bowser.getInfo()

    val spot = Dog("Spots", 20.0, 14.5, "Ilya Fedoseev")
    spot.getInfo()

    val tweety = Bird("Tweety",true)
    tweety.fly(10.0)

// Map
    val map = mutableMapOf<Int,Any?>()
    val map2 = mutableMapOf(1 to "Dog",2 to 25)
    map[1] = "ilya"
    map[2] = 42

    println("map Size : ${map.size}")
    map.put(3,"Moscow")
    map.remove(2)

    for ((x,y) in map){
        println("Key : $x Value : $y")
    }

// List
    var list1 : MutableList<Int> = mutableListOf(1,2,3,4,5)
    val list2 : List<Int> = listOf(1,2,3,4,5)

    list1.add(6)

    println("1st : ${list1.first()}")
    println("Last : ${list1.last()}")

    println("2nd : ${list1[2]}")

    var list3 = list1.subList(0,3)
    println("Length : ${list1.size}")

    list3.clear()
    list1.remove(1)
    list1.removeAt(1)
    list1.forEach { n -> println("Mutable List : $n") }



    //Exception
    val divisor = 2

    try {
        if(divisor == 0){
            throw IllegalArgumentException("Can't Divide by Zero")
        } else {
            println("5 / $divisor = ${5/divisor}")
        }
    } catch (e : IllegalArgumentException){
        println("${e.message}")
    }

    val numList3 = 1..20

    val times7 = numList3.map { it * 7 }
    times7.forEach { n -> println("*7 : $n") }

    println("Evens : ${numList3.any{it % 2 == 0}}")
    println("Evens : ${numList3.all{it % 2 == 0}}")

    val big3 = numList3.filter { it > 3 }

    big3.forEach {n -> println(">3 : $n")}

    val listSum = numList3.reduce { x, y -> x + y }
    println("Reduce Sum : $listSum")

    val listSum2 = numList3.fold(5) { x, y -> x + y }
    println("Fold Sum : $listSum2")

    val mult3 = makeMathFunc(3)
    println("5 * 3 ${mult3(5)}")

    val mult2 = {num1: Int -> num1 * 2}
    val numList2 = arrayOf(1,2,3,4,5)
    mathOnList(numList2,mult2)

    val numList = 1..20

    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n) }

    println("Sum = ${getSum(1,2,3,4,5)}")

    val multyply = {num1 : Int, num2 : Int -> num1 * num2}
    println("5 * 3 = ${multyply(5,3)} ")

    println("5! = ${fact(5)}")

// Functions


    fun add(num1: Int, num2: Int) : Int = num1 + num2
    println("5 + 4 = ${add(5,4)}")

    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2
    println("5 - 4 = ${add(5,4)}")

    println("4 - 5 = ${subtract(num2 = 5 , num1 = 4)}")

    fun sayHello(name: String) : Unit = println("Hello $name")
    sayHello("ilya")

    val (two, three) = nextTwo(1)
    println("1 $two $three")

// loop


    for(x in 1..10){
        println("Loop : $x")
    }

    val rand = Random()
    val magicNumber = rand.nextInt(50) + 1;

    var guess = 0

    while (magicNumber != guess){
        guess =+ 1
    }

    println("Magic Number was $guess")

    for(x in 1..20){
        if (x % 2 == 0){
            continue
        }

        println("Odd : $x")

        if(x == 15){
            break
        }
    }

    var arr3 : Array<Int> = arrayOf(3,6,9)

    for(i in arr3.indices){
        println("Mult 3 : ${arr3[i]}")
    }

    for ((index, value) in arr3.withIndex()){
        println("Index : $index Value : $value")
    }

// If and when

    val age = 8;

    if(age < 5){
        println("Go to PreSchool")
    } else if(age == 5){
        println("Go to Kindergarten")
    } else if ((age > 5) && (age <= 17)){
        val grade = age - 5
        println("Go to Grade $grade")
    } else {
        println("Go to College")
    }

    when(age){
        0,1,2,3,4 -> println("Go to PreSchool")

        5 -> println("Go to Kindergarten")

        in 6..17 -> {
            val grade = age - 5
            println("Go to Grade $grade")
        }

        else -> println("Go to College")
    }

    val oneToTen = 1..10
    val alpha = "A".."Z"

    println("R in Alpha : ${"R" in alpha}")

    val tenTo1 = 10.downTo(1)
    val TwoTo20 = 2.rangeTo(20);
    val rng3 = oneToTen.step(3);

    for(x in rng3) println("rng3 : $x")

    for(x in tenTo1.reversed()) println("Reverse : $x")


//  Arrays

    var myArray = arrayOf(1,1.2,"Dog");
    println(myArray[2]);

    myArray[1] = "String";
    println("Array length : ${myArray.size}")
    println("Array contains : ${myArray.contains("Dog")}")

    var partArray = myArray.copyOfRange(0,1);
    println("First : ${partArray.first()}")
    println("Dog Index : ${myArray.indexOf("Dog")}")

    var sqArray = Array(5,{x -> x * x})
    println(sqArray[2])

    var sqArray2 : Array<Int> = arrayOf(1,2,3)


    println("Hello world")

    val myName = "Ilya Fedoseev"
    val longString = "Long String and sooo...."

    var fName : String = "Ilya"
    var lName : String = "Fedoseev"

    fName = "Sasha"

    var fullName = fName + " " + lName
    println("Name : $fullName")
    println("1 + 2 = ${1 + 2}")
    println("String Length : ${longString.length}")

    var str1 = "A random String"
    var str2 = "a random String"

    println("String Equals : ${str1.equals(str2)}")
    println("Compare A to B : ${"A".compareTo("B")}")
    println("The second Index : ${str1[2]}")
    println("Index 2 -7 : ${str1.subSequence(2,8)}")
    println("Contains random : ${str1.contains("random")}")



    println("3.14 to Int" + (3.14.toInt()))
    println("A to Int" + ("A".toInt()))
    println("65 to Char" + 65.toChar())

    var letterChar : Char = 'A'
    print("A is a Char : ${letterChar is Char}")

    if(true is Boolean){
        print("true is boolean\n")
    }

    val name = "Ilya"

    var myAge = 22

    var bigInt : Int = Int.MAX_VALUE
    var smallInt : Int = Int.MIN_VALUE

    println("Biggest Int : " + bigInt)
    println("Smallest Int : $smallInt")


}

open class  Animal(val name: String, var height: Double, var weight: Double){
    init {
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)) {"Animal name Can't Contains Numbers"}
        require(height > 0) {"Height must be Great then 0"}
        require(weight > 0) {"Height must be Great then 0"}
    }

    open fun getInfo(): Unit{
        println("$name is $height tall and weighs $weight")
    }
}

open class Dog(name: String,height: Double,weight: Double,var owner: String) : Animal(name,height,weight){
    override fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight and is owned by $owner")
    }
}

interface Flyable{
    var flies: Boolean
    fun fly(distMile : Double): Unit
}

class Bird constructor(val name: String, override var flies: Boolean = true) : Flyable {
    override fun fly(distMile: Double):Unit {
        if (flies){
            println("$name flies $distMile miles")
        }
    }
}

fun makeMathFunc(num1: Int) : (Int) -> Int = {num2 -> num1 * num2}

fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int){
    for (num in numList){
        println("MathOnList ${myFunc}")
    }
}


fun fact(x: Int): Int {
    tailrec fun factTail(y: Int,z: Int): Int{
        if (y == 0) return z;
        else return factTail(y - 1,y * z)
    }
    return  factTail(x,1)
}

fun getSum(vararg num : Int): Int{
    var sum = 0
    num.forEach { n -> sum += n }
    return sum
}

fun nextTwo(num : Int): Pair<Int, Int> {
    return Pair(num+1, num+2)
}