package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_441 {
    private val production = Production21_441("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}