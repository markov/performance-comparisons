package org.gradle.test.performance8_1

open class Production8_2 : org.gradle.test.performance5_1.Production5_2() {
    override val property: String

    init {
        this.property = "foo"
    }

}
