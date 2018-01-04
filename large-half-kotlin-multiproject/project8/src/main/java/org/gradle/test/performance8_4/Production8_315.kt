package org.gradle.test.performance8_4

open class Production8_315 : org.gradle.test.performance6_4.Production6_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
