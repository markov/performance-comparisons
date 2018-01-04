package org.gradle.test.performance11_4

open class Production11_315 : org.gradle.test.performance8_4.Production8_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
