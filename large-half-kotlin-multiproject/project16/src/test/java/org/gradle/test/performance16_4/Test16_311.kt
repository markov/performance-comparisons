package org.gradle.test.performance16_4

import org.junit.Assert.*

class Test16_311 {
    private val production = Production16_311("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}