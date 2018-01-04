package org.gradle.test.performance5_4

import org.junit.Assert.*

class Test5_319 {
    private val production = Production5_319("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}