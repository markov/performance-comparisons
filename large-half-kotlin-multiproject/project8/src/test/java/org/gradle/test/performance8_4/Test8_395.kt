package org.gradle.test.performance8_4

import org.junit.Assert.*

class Test8_395 {
    private val production = Production8_395("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}