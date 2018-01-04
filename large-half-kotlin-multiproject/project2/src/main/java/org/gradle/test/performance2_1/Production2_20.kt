package org.gradle.test.performance2_1

open class Production2_20 : org.gradle.test.performance1_1.Production1_20() {
    override val property: String

    init {
        this.property = "foo"
    }

}
