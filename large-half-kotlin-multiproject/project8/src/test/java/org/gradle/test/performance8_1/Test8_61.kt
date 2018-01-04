package org.gradle.test.performance8_1

import org.junit.Assert.*

class Test8_61 {
    private val production = Production8_61("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}