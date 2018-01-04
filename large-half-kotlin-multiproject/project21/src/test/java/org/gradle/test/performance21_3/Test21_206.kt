package org.gradle.test.performance21_3

import org.junit.Assert.*

class Test21_206 {
    private val production = Production21_206("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}