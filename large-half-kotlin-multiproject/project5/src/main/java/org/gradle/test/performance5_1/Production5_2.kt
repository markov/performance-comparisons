package org.gradle.test.performance5_1

open class Production5_2 : org.gradle.test.performance2_1.Production2_2() {
    override val property: String

    init {
        this.property = "foo"
    }

}
