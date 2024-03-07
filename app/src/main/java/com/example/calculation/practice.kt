package com.example.calculation


class Calculator1 {
    fun add(a: Double, b: Double): Double {
        return (a + b)
    }

    fun minus(a: Double, b: Double): Double {
        return (a - b)
    }

    fun times(a: Double, b: Double): Double {
        return (a * b)
    }

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("0으로 나누지 마시오")
        }
        return (a / b)
    }
}

fun main() {

    println("■■■사용법: 첫번째 숫자 누른 후 enter -> 두번째 숫자 누른 후 enter■■■")
    val cal = Calculator1() // 생성자

    var more = true // 누적 연산 여부 -> '누적연산' 선택 시 처음으로 돌아와 연산반복

    while (more) {   // 선택권 두 가지에 따른 readLine 중복으로, while문을 2개 뺐음.
        var num1 = readLine()!!.toDouble()
        var num2 = readLine()!!.toDouble()
        var acc1 = 0.0 // 계산해서 산출된 값 저장 변수
        var acc2 = 0.0 // 연산값들을 계속 저장하고 누적하는 변수.

        var continuation = true // 연산반복
        while (continuation) {
            if (num1 != null && num2 != null) {
                println("연산을 선택하세요")
                println("1.더하기 2.빼기 3.곱하기 4.나누기 5.종료하기")
            }

            var operation = readLine()!!.toInt()   // 1부터 5까지 선택가능
            when (operation) {
                1 -> {
                    acc1 = cal.add(num1, num2)
                    println("${acc1}")
                    continuation = false
                }

                2 -> {
                    acc1 = cal.minus(num1, num2)
                    println("${acc1}")
                    continuation = false
                }

                3 -> {
                    acc1 = cal.times(num1, num2)
                    println("${acc1}")
                    continuation = false
                }

                4 -> {
                    acc1 = cal.times(num1, num2)
                    println("${acc1}")
                    continuation = false
                }

                5 -> {
                    println("계산기를 종료합니다.")
                    continuation = false
                }

                else -> println("1부터 6까지만 선택 가능합니다.")
            }
        }

        var choice = readLine()!!.toInt() // 1 혹은 2 선택가능   // readLine 중복때문에, while 문 밖으로 뺐다.
        if (more) {
            when (choice) {
                1 -> {
                    acc2 += acc1
                    continuation = true
                    continue
                }

                2 -> {
                    println("계산기를 종료합니다")
                    continuation = false
                }
            }
        }
    }
}







