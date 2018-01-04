package org.gradle.test.performance14_4

open class Production14_400 : org.gradle.test.performance9_4.Production9_400() {
    override val property: String

    init {
        this.property = "foo"
    }

}
