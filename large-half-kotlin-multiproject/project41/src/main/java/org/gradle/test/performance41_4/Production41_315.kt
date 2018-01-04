package org.gradle.test.performance41_4

class Production41_315 : org.gradle.test.performance13_4.Production13_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
