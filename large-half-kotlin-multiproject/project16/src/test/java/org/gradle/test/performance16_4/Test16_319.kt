package org.gradle.test.performance16_4

import org.junit.Assert.*

class Test16_319 {
    private val production = Production16_319("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}