package org.gradle.test.performance3_4

class Production3_400 : org.gradle.test.performance2_4.Production2_400() {
    override val property: String

    init {
        this.property = "foo"
    }

}
