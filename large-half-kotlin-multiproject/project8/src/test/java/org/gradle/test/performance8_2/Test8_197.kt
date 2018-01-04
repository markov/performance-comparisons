package org.gradle.test.performance8_2

import org.junit.Assert.*

class Test8_197 {
    private val production = Production8_197("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}