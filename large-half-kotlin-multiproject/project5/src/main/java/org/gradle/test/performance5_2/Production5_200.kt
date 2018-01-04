package org.gradle.test.performance5_2

open class Production5_200 : org.gradle.test.performance2_2.Production2_200() {
    override val property: String

    init {
        this.property = "foo"
    }

}
