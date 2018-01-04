package org.gradle.test.performance21_3

import org.junit.Assert.*

class Test21_293 {
    private val production = Production21_293("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}