package org.gradle.test.performance8_1

open class Production8_64 : org.gradle.test.performance7_1.Production7_64() {
    override val property: String

    init {
        this.property = "foo"
    }

}
