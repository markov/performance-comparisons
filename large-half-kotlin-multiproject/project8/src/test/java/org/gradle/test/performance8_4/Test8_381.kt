package org.gradle.test.performance8_4

import org.junit.Assert.*

class Test8_381 {
    private val production = Production8_381("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}