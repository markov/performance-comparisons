package org.gradle.test.performance40_4

class Production40_315 : org.gradle.test.performance13_4.Production13_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
