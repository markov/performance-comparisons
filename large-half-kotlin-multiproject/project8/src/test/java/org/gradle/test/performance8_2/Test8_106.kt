package org.gradle.test.performance8_2

import org.junit.Assert.*

class Test8_106 {
    private val production = Production8_106("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}