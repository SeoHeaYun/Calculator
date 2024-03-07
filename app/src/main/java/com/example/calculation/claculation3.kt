package com.example.calculation

// LV3   -> 각 연산클래스 만든 후 calculation.kt에 있는 open class를 상속받기. 그 후, override 통해 추가기능 구현해보기.
class AddOperation: Calculator() {
    override fun add(a: Double, b: Double): Double {
        return (a + b)
    }
}

    class SubstractOperation : Calculator() {
        override fun minus(a: Double, b: Double): Double {
            return (a - b)
        }
    }

        class MultiplyOperation : Calculator() {
            override fun times(a: Double, b: Double): Double {
                return (a * b)
            }
        }

        class DivideOperation : Calculator() {
            override fun divide(a: Double, b: Double): Double {
                if (b == 0.0) {
                    throw IllegalArgumentException("0으로 나누지 마시오")
                }
                return (a / b)
            }
        }


        // 각 클래스 활용하여 LV1 다시 구현해보기
        fun main() {   // fun main run 하기 위해 클래스 위에 미리 설정해둠.
            val add = AddOperation()
            val minus = SubstractOperation()
            val times = MultiplyOperation()
            val divide = DivideOperation()

            var num1 = readLine()!!.toDouble()
            var num2 = readLine()!!.toDouble()
            if (num1 != null && num2 != null) {
                println("연산을 선택하세요")
                println("1.더하기 2.빼기 3.곱하기 4.나누기)")
            }
            var operation = readLine()!!.toInt()
            when (operation) {
                1 -> println("${add.add(num1, num2)}")
                2 -> println("${minus.minus(num1, num2)}")
                3 -> println("${times.times(num1, num2)}")
                4 -> println("${divide.divide(num1, num2)}")
            }
        }








/* 단일책임원칙, SRP (Single Responsibility Principle): 클래스는 하나의 책임만을 가져야한다는 원칙
  데이터를 로드하는 클래스, 데이터를 보여주는 클래스, 데이터를 관리하는 클래스의 책임이 분리되어야 기능변경 시 코드 변경을 최소화 할 수 있다.
  객체지향 프로그래밍의 특징 중 '캡슐화'에 해당
*/

