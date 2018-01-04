package org.gradle.test.performance16_3

import org.junit.Assert.*

class Test16_247 {
    private val production = Production16_247("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}