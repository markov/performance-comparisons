package org.gradle.test.performance2_1

open class Production2_42 : org.gradle.test.performance1_1.Production1_42() {
    override val property: String

    init {
        this.property = "foo"
    }

}
