package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_383 {
    private val production = Production21_383("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}