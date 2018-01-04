package org.gradle.test.performance21_3

import org.junit.Assert.*

class Test21_240 {
    private val production = Production21_240("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}