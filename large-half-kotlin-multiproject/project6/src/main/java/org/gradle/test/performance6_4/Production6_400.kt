package org.gradle.test.performance6_4

open class Production6_400 : org.gradle.test.performance5_4.Production5_400() {
    override val property: String

    init {
        this.property = "foo"
    }

}
