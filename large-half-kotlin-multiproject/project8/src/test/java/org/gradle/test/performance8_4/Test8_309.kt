package org.gradle.test.performance8_4

import org.junit.Assert.*

class Test8_309 {
    private val production = Production8_309("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}