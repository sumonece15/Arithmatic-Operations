fun main()
{
    var a = 5
    var b = 3.0

    println(" a = " + a + " b = " + b)

    println("a+b : ${a+b}")
    println("a-b : ${a-b}")
    println("a/b : ${a/b}")
    println("a*b : ${a*b}")
    println("a%b : ${a%b}")

    println("2*2+5 : ${2*2+5}")


    println("a++ : ${a++}")
    println("++a : ${++a}")

    println("a-- : ${a--}")
    println("--a : ${--a}")

    a+=2
    println("a+ : $a")

    a-=2
    println("a- : $a")

    a/=2
    println("a/ : $a")

    a*=2
    println("a* : $a")

    a%=2
    println("a% : $a")


}