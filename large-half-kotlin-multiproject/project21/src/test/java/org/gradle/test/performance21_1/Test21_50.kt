package org.gradle.test.performance21_1

import org.junit.Assert.*

class Test21_50 {
    private val production = Production21_50("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}