package org.gradle.test.performance8_3

import org.junit.Assert.*

class Test8_224 {
    private val production = Production8_224("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}