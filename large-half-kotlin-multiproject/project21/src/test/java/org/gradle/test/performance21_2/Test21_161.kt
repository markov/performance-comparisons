package org.gradle.test.performance21_2

import org.junit.Assert.*

class Test21_161 {
    private val production = Production21_161("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}