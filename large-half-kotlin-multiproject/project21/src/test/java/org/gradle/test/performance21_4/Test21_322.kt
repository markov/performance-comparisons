package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_322 {
    private val production = Production21_322("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}