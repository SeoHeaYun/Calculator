package com.example.calculation


// LV1 단계    ->  LV2 단계는 다음 calculation2.kt 파일에 구현했습니다.

    open class Calculator {
        open fun add(a: Double, b: Double): Double {
            return (a + b)
        }

        open fun minus(a: Double, b: Double): Double {
            return (a - b)
        }

        open fun times(a: Double, b: Double): Double {
            return (a * b)
        }

        open fun divide(a: Double, b: Double): Double {
            if (b == 0.0) {
                throw IllegalArgumentException("0으로 나누지 마시오")  // 부적합한 전달인자로 인한 예외발생시 예외 처리
            }
            return (a / b)
        }

    }
        fun main() {   // fun main run 하기 위해 클래스 위에 미리 설정해둠.
            val cal = Calculator()  // 생성자 호출하여 인스턴스 생성하기
            var num1 = readLine()!!.toDouble()
            var num2 = readLine()!!.toDouble()
            if (num1 != null && num2 != null) {
                println("연산을 선택하세요")
                println("1.더하기 2.빼기 3.곱하기 4.나누기)")
            }
            var operation = readLine()!!.toInt()
            when (operation) {
                1 -> println("${cal.add(num1, num2)}")
                2 -> println("${cal.minus(num1, num2)}")
                3 -> println("${cal.times(num1, num2)}")
                4 -> println("${cal.divide(num1, num2)}")
            }
        }









