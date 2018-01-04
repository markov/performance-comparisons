package org.gradle.test.performance16_4

import org.junit.Assert.*

class Test16_384 {
    private val production = Production16_384("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}