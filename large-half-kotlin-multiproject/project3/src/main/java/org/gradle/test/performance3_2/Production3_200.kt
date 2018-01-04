package org.gradle.test.performance3_2

class Production3_200 : org.gradle.test.performance2_2.Production2_200() {
    override val property: String

    init {
        this.property = "foo"
    }

}
