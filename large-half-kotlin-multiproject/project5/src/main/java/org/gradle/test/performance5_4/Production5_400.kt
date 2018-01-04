package org.gradle.test.performance5_4

open class Production5_400 : org.gradle.test.performance1_4.Production1_400() {
    override val property: String

    init {
        this.property = "foo"
    }

}
