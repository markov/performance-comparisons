package org.gradle.test.performance7_1

open class Production7_1 : org.gradle.test.performance2_1.Production2_1() {
    override val property: String

    init {
        this.property = "foo"
    }

}
