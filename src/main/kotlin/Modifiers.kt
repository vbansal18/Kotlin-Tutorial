fun main() {
    val objA = A()
    val objB = B()
    objA.p
    objB.p
}

open class A{
    public val p = 10
    internal val q = 20
    protected val r = 30    // only accessible by the subclasses
    private val s = 40      // not accessible outside the class
}
class B:A(){
    val a = r       // r is accessible only by B (subclass)
    fun test(){
        println(p)
        println(q)
        println(r)
//        println(s)
    }
}