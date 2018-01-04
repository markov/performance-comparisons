package org.gradle.test.performance16_4

import org.junit.Assert.*

class Test16_327 {
    private val production = Production16_327("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}