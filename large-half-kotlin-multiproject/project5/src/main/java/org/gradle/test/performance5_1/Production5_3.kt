package org.gradle.test.performance5_1

open class Production5_3 : org.gradle.test.performance4_1.Production4_3() {
    override val property: String

    init {
        this.property = "foo"
    }

}
