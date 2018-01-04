package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_429 {
    private val production = Production21_429("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}