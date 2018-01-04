package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_348 {
    private val production = Production21_348("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}