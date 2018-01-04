package org.gradle.test.performance4_4

open class Production4_315 : org.gradle.test.performance1_4.Production1_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
