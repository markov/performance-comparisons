package org.gradle.test.performance26_4

class Production26_315 : org.gradle.test.performance11_4.Production11_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
