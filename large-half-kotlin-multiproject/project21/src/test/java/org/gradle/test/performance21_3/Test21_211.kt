package org.gradle.test.performance21_3

import org.junit.Assert.*

class Test21_211 {
    private val production = Production21_211("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}