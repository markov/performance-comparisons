package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_399 {
    private val production = Production21_399("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}