package org.gradle.test.performance21_3

import org.junit.Assert.*

class Test21_230 {
    private val production = Production21_230("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}