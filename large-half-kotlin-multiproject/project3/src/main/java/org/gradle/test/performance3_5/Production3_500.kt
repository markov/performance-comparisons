package org.gradle.test.performance3_5

class Production3_500 : org.gradle.test.performance2_5.Production2_500() {
    override val property: String

    init {
        this.property = "foo"
    }

}
