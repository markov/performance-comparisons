package org.gradle.test.performance8_5

open class Production8_500 : org.gradle.test.performance7_5.Production7_500() {
    override val property: String

    init {
        this.property = "foo"
    }

}
