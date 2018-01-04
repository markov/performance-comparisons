package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_467 {
    private val production = Production21_467("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}