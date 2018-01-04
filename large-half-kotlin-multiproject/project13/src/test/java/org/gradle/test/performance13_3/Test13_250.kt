package org.gradle.test.performance13_3

import org.junit.Assert.*

class Test13_250 {
    private val production = Production13_250("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}