package org.gradle.test.performance7_1

open class Production7_2 : org.gradle.test.performance4_1.Production4_2() {
    override val property: String

    init {
        this.property = "foo"
    }

}
