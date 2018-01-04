package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_356 {
    private val production = Production21_356("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}