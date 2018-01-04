package org.gradle.test.performance3_1

class Production3_4 : org.gradle.test.performance2_1.Production2_4() {
    override val property: String

    init {
        this.property = "foo"
    }

}
