package org.gradle.test.performance10_1

open class Production10_1 : org.gradle.test.performance6_1.Production6_1() {
    override val property: String

    init {
        this.property = "foo"
    }

}
