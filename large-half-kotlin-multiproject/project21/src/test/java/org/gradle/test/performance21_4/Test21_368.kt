package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_368 {
    private val production = Production21_368("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}