package org.gradle.test.performance21_3

import org.junit.Assert.*

class Test21_235 {
    private val production = Production21_235("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}