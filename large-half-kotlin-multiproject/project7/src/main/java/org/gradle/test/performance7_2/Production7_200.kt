package org.gradle.test.performance7_2

open class Production7_200 : org.gradle.test.performance6_2.Production6_200() {
    override val property: String

    init {
        this.property = "foo"
    }

}
