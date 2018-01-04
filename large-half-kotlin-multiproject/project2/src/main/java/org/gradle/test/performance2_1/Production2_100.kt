package org.gradle.test.performance2_1

open class Production2_100 : org.gradle.test.performance1_1.Production1_100() {
    override val property: String

    init {
        this.property = "foo"
    }

}
