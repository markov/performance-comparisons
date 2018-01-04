package org.gradle.test.performance21_2

import org.junit.Assert.*

class Test21_143 {
    private val production = Production21_143("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}