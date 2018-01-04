package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_402 {
    private val production = Production21_402("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}