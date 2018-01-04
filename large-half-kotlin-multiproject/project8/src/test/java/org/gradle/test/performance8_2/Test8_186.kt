package org.gradle.test.performance8_2

import org.junit.Assert.*

class Test8_186 {
    private val production = Production8_186("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}