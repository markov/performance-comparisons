package org.gradle.test.performance16_1

open class Production16_2 : org.gradle.test.performance10_1.Production10_2() {
    override val property: String

    init {
        this.property = "foo"
    }

}
