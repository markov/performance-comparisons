package org.gradle.test.performance8_5

import org.junit.Assert.*

class Test8_469 {
    private val production = Production8_469("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}