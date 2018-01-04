package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_394 {
    private val production = Production21_394("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}