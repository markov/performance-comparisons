package org.gradle.test.performance11_5

open class Production11_500 : org.gradle.test.performance7_5.Production7_500() {
    override val property: String

    init {
        this.property = "foo"
    }

}
