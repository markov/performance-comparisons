package org.gradle.test.performance4_1

class Production4_100 : org.gradle.test.performance2_1.Production2_100() {
    override val property: String

    init {
        this.property = "foo"
    }

}
