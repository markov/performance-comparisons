package org.gradle.test.performance2_1

class Production2_3 : org.gradle.test.performance1_1.Production1_3() {
    override val property: String

    init {
        this.property = "foo"
    }

}
