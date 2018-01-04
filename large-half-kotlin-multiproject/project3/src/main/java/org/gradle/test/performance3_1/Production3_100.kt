package org.gradle.test.performance3_1

class Production3_100 : org.gradle.test.performance2_1.Production2_100() {
    override val property: String

    init {
        this.property = "foo"
    }

}
