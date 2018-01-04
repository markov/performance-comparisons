package org.gradle.test.performance4_5

class Production4_500 : org.gradle.test.performance2_5.Production2_500() {
    override val property: String

    init {
        this.property = "foo"
    }

}
