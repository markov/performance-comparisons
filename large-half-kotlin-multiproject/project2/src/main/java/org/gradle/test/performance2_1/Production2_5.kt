package org.gradle.test.performance2_1

open class Production2_5 : org.gradle.test.performance1_1.Production1_5() {
    override val property: String

    init {
        this.property = "foo"
    }

}
