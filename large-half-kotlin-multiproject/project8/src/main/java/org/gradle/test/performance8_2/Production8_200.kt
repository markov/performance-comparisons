package org.gradle.test.performance8_2

open class Production8_200 : org.gradle.test.performance7_2.Production7_200() {
    override val property: String

    init {
        this.property = "foo"
    }

}
