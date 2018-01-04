package org.gradle.test.performance8_3

import org.junit.Assert.*

class Test8_231 {
    private val production = Production8_231("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}