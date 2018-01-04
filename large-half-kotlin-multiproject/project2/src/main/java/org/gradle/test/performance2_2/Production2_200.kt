package org.gradle.test.performance2_2

open class Production2_200 : org.gradle.test.performance1_2.Production1_200() {
    override val property: String

    init {
        this.property = "foo"
    }

}
