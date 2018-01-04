package org.gradle.test.performance3_1

class Production3_1 : org.gradle.test.performance1_1.Production1_1() {
    override val property: String

    init {
        this.property = "foo"
    }

}
