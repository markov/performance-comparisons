package org.gradle.test.performance8_4

open class Production8_400 : org.gradle.test.performance7_4.Production7_400() {
    override val property: String

    init {
        this.property = "foo"
    }

}
