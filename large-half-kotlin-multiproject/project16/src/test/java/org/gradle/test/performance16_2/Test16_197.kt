package org.gradle.test.performance16_2

import org.junit.Assert.*

class Test16_197 {
    private val production = Production16_197("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}