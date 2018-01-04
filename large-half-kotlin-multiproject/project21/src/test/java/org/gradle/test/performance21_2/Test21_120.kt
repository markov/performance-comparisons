package org.gradle.test.performance21_2

import org.junit.Assert.*

class Test21_120 {
    private val production = Production21_120("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}