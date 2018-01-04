package org.gradle.test.performance21_2

import org.junit.Assert.*

class Test21_175 {
    private val production = Production21_175("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}