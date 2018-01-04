package org.gradle.test.performance5_3

open class Production5_300 : org.gradle.test.performance4_3.Production4_300() {
    override val property: String

    init {
        this.property = "foo"
    }

}
