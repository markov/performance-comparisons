package org.gradle.test.performance14_5

open class Production14_500 : org.gradle.test.performance9_5.Production9_500() {
    override val property: String

    init {
        this.property = "foo"
    }

}
