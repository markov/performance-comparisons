package org.gradle.test.performance16_1

open class Production16_64 : org.gradle.test.performance10_1.Production10_64() {
    override val property: String

    init {
        this.property = "foo"
    }

}
