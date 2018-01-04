package org.gradle.test.performance10_4

open class Production10_400 : org.gradle.test.performance6_4.Production6_400() {
    override val property: String

    init {
        this.property = "foo"
    }

}
