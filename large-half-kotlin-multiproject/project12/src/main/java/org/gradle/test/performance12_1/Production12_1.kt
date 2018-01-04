package org.gradle.test.performance12_1

open class Production12_1 : org.gradle.test.performance7_1.Production7_1() {
    override val property: String

    init {
        this.property = "foo"
    }

}
