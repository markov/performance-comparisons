package org.gradle.test.performance8_3

import org.junit.Assert.*

class Test8_248 {
    private val production = Production8_248("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}