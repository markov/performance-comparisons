package org.gradle.test.performance8_1

import org.junit.Assert.*

class Test8_37 {
    private val production = Production8_37("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}