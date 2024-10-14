package com.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import kotlin.math.PI
import kotlin.math.ceil
import kotlin.math.max
import kotlin.math.round

@SpringBootApplication
class KotlinSpringApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringApplication>(*args)

}

//	val gender = "female1"
//
//	val genderval =  when(gender){
//		"female" -> "female"
//		"male" -> "male"
//		else -> {
//			"unknown gender"
//		}
//	}
//
//	//println(genderval)
//
//	when{
//		//(10 > 20) -> println("greater")
//		else -> {
//			//println("less than")
//		}
//	}
//
//	val age = 25
//
//	when(age) {
//		in 0..12 -> println("kids")
//		in 13..18 -> println("teenager")
//		in 19..25 -> println("adult")
//	}
////	val names = arrayOf("jamila", "jarek");
////	names[0] = "sameera"
////
////	val mutableLists = mutableListOf("prabhu", "appu")
////
////	mutableLists.add("birdar")
////
////	for(a in mutableLists){
////		println(a)
////	}
//
//
//	val nameslIst = listOf("mary", "alice")
//
//	nameslIst.forEach({
//		println(it)
//	}
//	)
//
//	val numbers = intArrayOf(1,2,3,4,5)
//
//	for (name in nameslIst){
//		val n = name.replaceFirstChar {
//			it.uppercase()
//		}
//
//		//println(n)
//	}
//	//println()
//
//	for (number in numbers){
//		//println(number)
//	}
//
//	val chars = charArrayOf('a', 'b', 'c')
//
//	for (index in chars.indices){
//		println("$index ${chars[index]}")
//	}
//
//	for (index in chars.indices.reversed()){
//		println("$index ${chars[index]}")
//	}
//
//	for(i in 1..10 step 2){
//		println(i)
//	}
//
//	for(i in 5 downTo 1){
//		println(i)
//	}
//
//	val string = "amigoscode";
//
//	for(c in string){
//		println(c)
//	}
//
//
//	var number = 1;
//
//	//named parameters
//
//	greet(age= 23, name="amigo")
//
//	//default parameters
//
//
//	//function as parameter
//
//	fun foo(bar : ()-> Unit){
//
//		println("bar function")
//		bar()
//	}
//
//}
//
//fun greet(age: Int = -1, name: String) {
//		println("$age $name")
//}
