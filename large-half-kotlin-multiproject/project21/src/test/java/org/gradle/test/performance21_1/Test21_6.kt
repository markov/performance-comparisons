package org.gradle.test.performance21_1

import org.junit.Assert.*

class Test21_6 {
    private val production = Production21_6("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}