package org.gradle.test.performance12_1

open class Production12_2 : org.gradle.test.performance8_1.Production8_2() {
    override val property: String

    init {
        this.property = "foo"
    }

}
