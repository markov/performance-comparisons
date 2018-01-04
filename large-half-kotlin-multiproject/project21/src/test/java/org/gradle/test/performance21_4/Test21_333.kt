package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_333 {
    private val production = Production21_333("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}