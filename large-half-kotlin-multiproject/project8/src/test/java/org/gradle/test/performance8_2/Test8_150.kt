package org.gradle.test.performance8_2

import org.junit.Assert.*

class Test8_150 {
    private val production = Production8_150("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}