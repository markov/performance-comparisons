package org.gradle.test.performance10_1

open class Production10_100 : org.gradle.test.performance6_1.Production6_100() {
    override val property: String

    init {
        this.property = "foo"
    }

}
