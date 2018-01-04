package org.gradle.test.performance22_4

class Production22_315 : org.gradle.test.performance10_4.Production10_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
