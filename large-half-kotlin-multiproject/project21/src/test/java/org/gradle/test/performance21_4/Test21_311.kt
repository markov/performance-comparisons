package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_311 {
    private val production = Production21_311("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}