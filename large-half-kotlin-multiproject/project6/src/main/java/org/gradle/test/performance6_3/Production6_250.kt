package org.gradle.test.performance6_3

open class Production6_250 : org.gradle.test.performance2_3.Production2_250() {
    override val property: String

    init {
        this.property = "foo"
    }

}
