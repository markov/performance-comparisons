package org.gradle.test.performance16_4

import org.junit.Assert.*

class Test16_336 {
    private val production = Production16_336("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}