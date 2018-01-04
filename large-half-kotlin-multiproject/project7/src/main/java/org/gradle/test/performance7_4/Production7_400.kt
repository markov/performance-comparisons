package org.gradle.test.performance7_4

open class Production7_400 : org.gradle.test.performance6_4.Production6_400() {
    override val property: String

    init {
        this.property = "foo"
    }

}
