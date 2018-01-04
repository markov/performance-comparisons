package org.gradle.test.performance15_1

open class Production15_1 : org.gradle.test.performance8_1.Production8_1() {
    override val property: String

    init {
        this.property = "foo"
    }

}
