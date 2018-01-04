package org.gradle.test.performance4_3

open class Production4_250 : org.gradle.test.performance2_3.Production2_250() {
    override val property: String

    init {
        this.property = "foo"
    }

}
