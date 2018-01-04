package org.gradle.test.performance15_5

open class Production15_500 : org.gradle.test.performance9_5.Production9_500() {
    override val property: String

    init {
        this.property = "foo"
    }

}
