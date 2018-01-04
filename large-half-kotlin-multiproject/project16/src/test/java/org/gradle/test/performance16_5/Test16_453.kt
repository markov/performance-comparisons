package org.gradle.test.performance16_5

import org.junit.Assert.*

class Test16_453 {
    private val production = Production16_453("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}