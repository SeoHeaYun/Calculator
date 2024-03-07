package com.example.calculation

// LV4 구현입니다.

abstract class AbstractOperation {  // 추상화
    abstract fun add(a: Double, b: Double):Double
    abstract fun minus(a: Double, b: Double):Double
    abstract fun times(a: Double, b: Double):Double
    abstract fun divide(a: Double, b: Double):Double


}

class implements: AbstractOperation() {    // 추상화 클래스 채워넣기

    override fun add(a: Double, b: Double):Double {
        return a+b
    }

    override fun minus(a: Double, b: Double):Double {
        return (a-b)
    }

    override fun times(a: Double, b: Double): Double {
        return (a+b)
    }

    override fun divide(a: Double, b: Double): Double {
        return (a/b)

    }

}


// 클래스의 의존성 역전 원칙:
// 고수준 모듈은 저수준 모듈의 구현에 의존해서는 안 된다..
//대신 저수준 모듈이 고수준 모듈에서 정의한 추상 타입에 의존해야 합니다.
