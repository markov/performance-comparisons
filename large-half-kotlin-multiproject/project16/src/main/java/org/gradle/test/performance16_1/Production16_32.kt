package org.gradle.test.performance16_1

open class Production16_32 : org.gradle.test.performance10_1.Production10_32() {
    override val property: String

    init {
        this.property = "foo"
    }

}
