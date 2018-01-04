package org.gradle.test.performance21_3

import org.junit.Assert.*

class Test21_243 {
    private val production = Production21_243("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}