package com.example.calculation

// LV2 -> LV3은 calculation3.kt에 구현했습니다.

fun main() {
    val cal = Calculator() // 생성자
    var sum = 0.0 // 값 누적하는 변수
    var isFirstInput = true // 첫번째 인풋일 때만 숫자 2개 입력하면 되고 false면 하나만 입력하여 sum과 결합하면 됨.

    println("■■■콘솔 계산기■■■")

    while (true) {  //  break 전까지 계속 반복
        if (isFirstInput) {
            println("숫자 두개를 각각 입력해주세요")
            var num1 = readLine()!!.toDouble()
            var num2 = readLine()!!.toDouble()
            println("원하는 연산을 입력해주세요: 1.더하기 2.빼기 3.곱하기 4.나누기 5. 종료")
            var operator = readLine()!!.toInt()  // 연산적는 곳

            when (operator) {
                1 -> {
                    sum = cal.add(num1, num2)
                    println("${sum}")
                }

                2 -> {
                    sum = cal.minus(num1, num2)
                    println("${sum}")
                }

                3 -> {
                    sum = cal.times(num1, num2)
                    println("${sum}")

                }

                4 -> {
                    sum = cal.divide(num1, num2)
                    println("${sum}")
                }

                5 -> {
                    println("계산기를 종료합니다.")
                    break
                }

                else -> {
                    println("1부터 5까지의 숫자만 입력가능합니다.")
                    continue
                }
            }
            isFirstInput = false // false로 만들어 이제부터 아래 계속 실행
        }
        if (!isFirstInput) {
            println("누적하여 연산할 숫자를 입력하세요")
            var num3 = readLine()!!.toDouble()
            println("1.더하기 2.빼기 3.곱하기 4.나누기 5. 종료")
            var operator = readLine()!!.toInt()  // 연산적는 곳

            when (operator) {
                1 -> {
                    sum = cal.add(sum, num3)
                    println("${sum}")
                }

                2 -> {
                    sum = cal.minus(sum, num3)
                    println("${sum}")
                }

                3 -> {
                    sum = cal.times(sum, num3)
                    println("${sum}")

                }

                4 -> {
                    sum = cal.divide(sum, num3)
                    println("${sum}")

                }

                5 -> {
                    println("계산기를 종료합니다.")
                    break
                }

                else -> {
                    println("1부터 5까지의 숫자만 입력가능합니다.")
                    continue
                }
            }
        }
    }
}
