package b_operator

data class User(
    val email:String,
    val password:String,
){
    operator fun get(key: String):Any?{
        return User::class.members.find{it.name == key}?.call(this)
    }

}

fun main() {
    val user = User("jkm@grep.com", "1111")
    println(user["email"])
}