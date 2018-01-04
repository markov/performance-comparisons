package org.gradle.test.performance9_2

open class Production9_200 : org.gradle.test.performance6_2.Production6_200() {
    override val property: String

    init {
        this.property = "foo"
    }

}
