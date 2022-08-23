open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }
}
fun main(){
    var s1=Student("Bhavya","Patel",20,20012011079,"CE","C","AB8")
    var s2=Student("Dec","Patel",20,20012011083,"CE","C","AB8")
    var s3=Student("Kathan","Patel",21,20012011101,"CE","B","AB3")
    var s4=Student("Jeel","Patel",20,20012011000,"IT","A","XY")
    var s5=Student("Ankita","Patel",19,20012011000,"AI","A","XY")
}