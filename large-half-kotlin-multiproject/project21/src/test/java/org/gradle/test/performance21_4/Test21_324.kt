package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_324 {
    private val production = Production21_324("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}