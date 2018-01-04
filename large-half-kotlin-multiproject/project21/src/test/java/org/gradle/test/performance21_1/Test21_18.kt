package org.gradle.test.performance21_1

import org.junit.Assert.*

class Test21_18 {
    private val production = Production21_18("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}