package org.gradle.test.performance21_2

import org.junit.Assert.*

class Test21_132 {
    private val production = Production21_132("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}