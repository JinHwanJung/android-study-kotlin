package jinhwan.com.kotlinandroidstudy

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    fun add(a: Int, b: Int): Int {
        return a+b
    }

    fun add2(a: Int, b: Int): Int = a + b

    fun Int.add3(b: Int) = this + b

    infix fun Int.add4(b: Int) = this + b

    @Test
    fun test_main() {
        println("add : ${add(3,4)}")

        println("add2 : ${add2(3,4)}")

        println("add3 : ${3.add3(4)}")

        println("add4 : ${3 add4 4}")
    }
}
