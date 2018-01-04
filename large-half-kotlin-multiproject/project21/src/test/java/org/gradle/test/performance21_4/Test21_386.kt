package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_386 {
    private val production = Production21_386("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}