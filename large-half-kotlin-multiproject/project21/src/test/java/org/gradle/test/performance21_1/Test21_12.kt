package org.gradle.test.performance21_1

import org.junit.Assert.*

class Test21_12 {
    private val production = Production21_12("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}