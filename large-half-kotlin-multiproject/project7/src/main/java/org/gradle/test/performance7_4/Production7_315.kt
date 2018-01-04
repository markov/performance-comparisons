package org.gradle.test.performance7_4

open class Production7_315 : org.gradle.test.performance5_4.Production5_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
