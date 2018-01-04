package org.gradle.test.performance11_1

open class Production11_1 : org.gradle.test.performance6_1.Production6_1() {
    override val property: String

    init {
        this.property = "foo"
    }

}
