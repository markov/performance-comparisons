package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_409 {
    private val production = Production21_409("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}