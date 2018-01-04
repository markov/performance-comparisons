package org.gradle.test.performance2_3

open class Production2_250 : org.gradle.test.performance1_3.Production1_250() {
    override val property: String

    init {
        this.property = "foo"
    }

}
