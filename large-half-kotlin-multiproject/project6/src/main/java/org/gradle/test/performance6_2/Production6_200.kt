package org.gradle.test.performance6_2

open class Production6_200 : org.gradle.test.performance5_2.Production5_200() {
    override val property: String

    init {
        this.property = "foo"
    }

}
