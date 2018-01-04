package org.gradle.test.performance8_2

import org.junit.Assert.*

class Test8_115 {
    private val production = Production8_115("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}