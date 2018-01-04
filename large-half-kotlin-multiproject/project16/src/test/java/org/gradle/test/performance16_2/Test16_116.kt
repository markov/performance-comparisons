package org.gradle.test.performance16_2

import org.junit.Assert.*

class Test16_116 {
    private val production = Production16_116("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}