package org.gradle.test.performance27_4

class Production27_315 : org.gradle.test.performance11_4.Production11_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
