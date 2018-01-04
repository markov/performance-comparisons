package org.gradle.test.performance21_4

class Production21_315 : org.gradle.test.performance10_4.Production10_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
