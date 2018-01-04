package org.gradle.test.performance8_4

import org.junit.Assert.*

class Test8_351 {
    private val production = Production8_351("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}