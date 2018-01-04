package org.gradle.test.performance21_1

import org.junit.Assert.*

class Test21_57 {
    private val production = Production21_57("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}