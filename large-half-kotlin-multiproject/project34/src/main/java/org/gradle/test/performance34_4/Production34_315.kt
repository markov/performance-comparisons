package org.gradle.test.performance34_4

class Production34_315 : org.gradle.test.performance12_4.Production12_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
