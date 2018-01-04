package org.gradle.test.performance15_1

open class Production15_2 : org.gradle.test.performance9_1.Production9_2() {
    override val property: String

    init {
        this.property = "foo"
    }

}
