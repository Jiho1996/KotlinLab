package com.foo.kotlinlab

import androidx.appcompat.app.AppCompatActivity

class Kotlin : AppCompatActivity() {





    object lala{
 //       const val foo = go() // go는 문자열 또는 기본이 아니므로 빨간줄 생성
        val fooVal = go() // ok.
        const val bar = "Hello world" //ok.

        private fun go() {

            fun sum(x:Int,y:Int) = x+y

        }
    }

    fun aos() {
        val data: Int = 10 // val(var) 변수명 : 타입 = 값
        val data1 = "Jiho" // 타입추론
  //      data = 5 // val 는 변경불가능.

        var mdata = 40
        mdata = 30 // val 은 변경가능.

        val data3: String? = null
 //       val data4: String = null


    }
    fun sum(x:Int, y:Int) :Int{
        return x+y
    }


}
