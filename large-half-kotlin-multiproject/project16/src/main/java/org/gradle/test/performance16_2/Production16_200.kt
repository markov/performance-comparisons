package org.gradle.test.performance16_2

open class Production16_200 : org.gradle.test.performance10_2.Production10_200() {
    override val property: String

    init {
        this.property = "foo"
    }

}
