package org.gradle.test.performance8_1

import org.junit.Assert.*

class Test8_52 {
    private val production = Production8_52("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}