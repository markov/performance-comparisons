package org.gradle.test.performance21_3

import org.junit.Assert.*

class Test21_257 {
    private val production = Production21_257("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}