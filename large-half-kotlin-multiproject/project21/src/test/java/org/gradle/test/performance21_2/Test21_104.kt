package org.gradle.test.performance21_2

import org.junit.Assert.*

class Test21_104 {
    private val production = Production21_104("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}