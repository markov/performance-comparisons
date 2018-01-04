package org.gradle.test.performance8_4

import org.junit.Assert.*

class Test8_329 {
    private val production = Production8_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}