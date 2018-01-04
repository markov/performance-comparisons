package org.gradle.test.performance3_3

class Production3_300 : org.gradle.test.performance2_3.Production2_300() {
    override val property: String

    init {
        this.property = "foo"
    }

}
