package org.gradle.test.performance13_3

import org.junit.Assert.*

class Test13_271 {
    private val production = Production13_271("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}