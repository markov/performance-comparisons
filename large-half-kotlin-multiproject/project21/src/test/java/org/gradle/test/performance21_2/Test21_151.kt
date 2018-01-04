package org.gradle.test.performance21_2

import org.junit.Assert.*

class Test21_151 {
    private val production = Production21_151("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}