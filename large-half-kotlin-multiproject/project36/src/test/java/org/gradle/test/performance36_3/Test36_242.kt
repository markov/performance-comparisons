package org.gradle.test.performance36_3

import org.junit.Assert.*

class Test36_242 {
    private val production = Production36_242("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}