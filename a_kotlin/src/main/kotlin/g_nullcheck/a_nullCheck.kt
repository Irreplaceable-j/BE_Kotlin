package g_nullcheck

var name:String? = null
var jkm:Student? = Student(name)

class Student(
    var name:String?,
    val age:Int? = 15
){

}

fun main() {
//    studySafeCall()
//    studyNonNull()
//    orElseGet()
//    orElseThrow()
    ifPresent()
}

fun studySafeCall(){
    name = "jkm"
    println(name?.length)
    println(jkm?.name)

    name = null
    jkm = null

    println(name?.length)
    println(jkm?.name)
}

// 절대 null이 아님을 확신할 수 있는 상황에서만 사용
fun studyNonNull(){
    println(name!!.length)
}

// Optional.orElseGet
fun orElseGet(){
    println(name?.length ?: 0)
}

// Optional.orElseThrow
fun orElseThrow(){
    println(name?.length ?: throw NoSuchElementException())
}

// Optional.ifPresent
fun ifPresent(){
    name = "정기문"
    name?.let{ println(it) }
}



