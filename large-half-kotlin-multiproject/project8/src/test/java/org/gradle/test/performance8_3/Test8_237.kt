package org.gradle.test.performance8_3

import org.junit.Assert.*

class Test8_237 {
    private val production = Production8_237("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}