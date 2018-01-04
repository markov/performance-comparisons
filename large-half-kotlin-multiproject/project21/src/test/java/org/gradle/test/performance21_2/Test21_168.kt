package org.gradle.test.performance21_2

import org.junit.Assert.*

class Test21_168 {
    private val production = Production21_168("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}