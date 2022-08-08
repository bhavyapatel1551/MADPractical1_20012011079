import jdk.nashorn.internal.ir.CallNode.EvalArgs

fun main() {
    op(111,2222,-222)

}
fun op(n1:Int, n2:Int ,n3:Int)
{
    var sum:Int=n1+n2+n3
    var sub:Int=n1-n2-n3
    var mul:Int=n1*n2*n3
    var div:Int=n1/n2/n3
    println("Addition is $sum")
    println("Subtraction is $sub")
    println("Multiplication is $mul")
    println("Division is $div")

}