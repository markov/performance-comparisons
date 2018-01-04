package org.gradle.test.performance8_2

open class Production8_192 : org.gradle.test.performance7_2.Production7_192() {
    override val property: String

    init {
        this.property = "foo"
    }

}
