package org.gradle.test.performance21_1

import org.junit.Assert.*

class Test21_51 {
    private val production = Production21_51("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}