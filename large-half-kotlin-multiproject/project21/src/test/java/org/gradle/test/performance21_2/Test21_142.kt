package org.gradle.test.performance21_2

import org.junit.Assert.*

class Test21_142 {
    private val production = Production21_142("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}