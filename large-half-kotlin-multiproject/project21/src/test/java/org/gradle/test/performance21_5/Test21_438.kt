package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_438 {
    private val production = Production21_438("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}