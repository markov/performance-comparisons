package org.gradle.test.performance8_2

import org.junit.Assert.*

class Test8_180 {
    private val production = Production8_180("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}