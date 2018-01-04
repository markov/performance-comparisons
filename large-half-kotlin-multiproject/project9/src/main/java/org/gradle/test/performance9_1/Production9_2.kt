package org.gradle.test.performance9_1

open class Production9_2 : org.gradle.test.performance6_1.Production6_2() {
    override val property: String

    init {
        this.property = "foo"
    }

}
