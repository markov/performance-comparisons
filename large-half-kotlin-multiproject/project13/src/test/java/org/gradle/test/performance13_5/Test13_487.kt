package org.gradle.test.performance13_5

import org.junit.Assert.*

class Test13_487 {
    private val production = Production13_487("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}