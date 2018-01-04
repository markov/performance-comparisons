package org.gradle.test.performance10_1

open class Production10_2 : org.gradle.test.performance7_1.Production7_2() {
    override val property: String

    init {
        this.property = "foo"
    }

}
