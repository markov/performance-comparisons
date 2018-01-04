package org.gradle.test.performance13_5

open class Production13_500 : org.gradle.test.performance8_5.Production8_500() {
    override val property: String

    init {
        this.property = "foo"
    }

}
