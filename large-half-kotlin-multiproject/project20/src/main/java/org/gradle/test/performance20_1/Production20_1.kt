package org.gradle.test.performance20_1

class Production20_1 : org.gradle.test.performance10_1.Production10_1() {
    override val property: String

    init {
        this.property = "foo"
    }

}
