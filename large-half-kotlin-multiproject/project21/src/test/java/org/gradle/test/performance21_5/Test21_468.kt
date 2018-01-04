package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_468 {
    private val production = Production21_468("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}