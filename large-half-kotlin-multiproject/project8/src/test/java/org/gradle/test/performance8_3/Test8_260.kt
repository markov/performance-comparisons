package org.gradle.test.performance8_3

import org.junit.Assert.*

class Test8_260 {
    private val production = Production8_260("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}