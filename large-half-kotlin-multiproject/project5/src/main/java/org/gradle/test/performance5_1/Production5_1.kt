package org.gradle.test.performance5_1

open class Production5_1 : org.gradle.test.performance1_1.Production1_1() {
    override val property: String

    init {
        this.property = "foo"
    }

}
