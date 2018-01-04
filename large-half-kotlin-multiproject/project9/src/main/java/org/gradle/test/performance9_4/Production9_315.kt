package org.gradle.test.performance9_4

open class Production9_315 : org.gradle.test.performance7_4.Production7_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
