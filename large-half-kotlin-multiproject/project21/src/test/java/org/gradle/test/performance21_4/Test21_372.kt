package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_372 {
    private val production = Production21_372("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}