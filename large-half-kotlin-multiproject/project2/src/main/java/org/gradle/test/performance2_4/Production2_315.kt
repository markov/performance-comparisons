package org.gradle.test.performance2_4

class Production2_315 : org.gradle.test.performance1_4.Production1_315() {
    private val property: String

    init {
        this.property = "foo"
    }

    override fun getProperty(): String {
        return property
    }

}
