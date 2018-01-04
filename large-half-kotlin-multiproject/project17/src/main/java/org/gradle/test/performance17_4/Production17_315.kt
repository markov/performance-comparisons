package org.gradle.test.performance17_4

open class Production17_315 : org.gradle.test.performance9_4.Production9_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
