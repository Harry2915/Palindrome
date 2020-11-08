package harish.hibare.palindrome

import java.util.*

fun isPalindromeString(inputStr: String): Boolean {
    val sb = StringBuilder(inputStr)

    val reverseStr = sb.reverse().toString()

    return inputStr.equals(reverseStr, ignoreCase = true)
}

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)


    println("Enter String : ")
    val inString: String = sc.nextLine()

    
    if (isPalindromeString(inString)) {
        println("$inString is a Palindrome String")
    } else {
        println("$inString is not a Palindrome String")
    }
}