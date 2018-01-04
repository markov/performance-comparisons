package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_391 {
    private val production = Production21_391("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}