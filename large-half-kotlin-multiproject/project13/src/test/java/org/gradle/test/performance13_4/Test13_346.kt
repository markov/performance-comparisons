package org.gradle.test.performance13_4

import org.junit.Assert.*

class Test13_346 {
    private val production = Production13_346("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}