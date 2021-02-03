package com.foo.kotlinlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random.Default.Companion

class companion_class_lab : AppCompatActivity() {

    class companion_class {

        companion object {

            val test1 : Int = 0
            val  test2 : Int = 1
            val test3 : Int = 2
        }
    }

    class non_companion_class{
        object lab{
            val test4 : Int = 0
            val test5 : Int = 1
            val test6 : Int = 2
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jiho = companion_class.test1
     //   val park = non_companion_class.test4 // 에러발생!!

        val kim = non_companion_class.lab.test4

    }
}