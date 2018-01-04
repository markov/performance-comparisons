package org.gradle.test.performance6_4

open class Production6_315 : org.gradle.test.performance4_4.Production4_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
