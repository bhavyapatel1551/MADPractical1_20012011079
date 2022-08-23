open class Product(name: String,quantity: Int){
    var p:Int=-1
    init {
        println("Product name :$name")
        println("Quantity: $quantity")
    }
    constructor(name: String,quantity: Int,p: Int) : this(name,quantity){
        this.p=p
        println("Price :$p per piece")
    }
}
class Laptop(name: String,quantity: Int,price : Int,cpu_n:String,RAM_s:String):Product(name,quantity,price){
    var hdd:String=""
    init{
        println("CPU name:$cpu_n")
        println("RAM_Size:$RAM_s")
    }
    constructor(name: String,quantity:Int,price: Int,cpu_n: String,RAM_s: String,hdd:String):this(name,quantity,price,cpu_n,RAM_s){
        this.hdd=hdd
        println("HDD_Size:$hdd")
        println("---------------")
    }
}
fun main(){
    var l1=Laptop("HP",2,150000,"core i7","32GB","1TB")
    var l2=Laptop("DELL",2,65000,"Core i5","8GB","256GB")
    var l3=Laptop("MAC",2,95000,"Core i7","16GB","512GB")
    var l4=Laptop("ROG",1,65000,"Core i3","4GB","256GB")
    var l5=Laptop("HP",5,40000,"Core i5","8GB","512GB")
}