package org.gradle.test.performance21_2

import org.junit.Assert.*

class Test21_160 {
    private val production = Production21_160("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}