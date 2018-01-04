package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_341 {
    private val production = Production21_341("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}