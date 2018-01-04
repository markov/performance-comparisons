package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_359 {
    private val production = Production21_359("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}