package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_482 {
    private val production = Production21_482("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}