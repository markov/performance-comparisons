package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_420 {
    private val production = Production21_420("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}