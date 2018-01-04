package org.gradle.test.performance8_3

import org.junit.Assert.*

class Test8_281 {
    private val production = Production8_281("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}