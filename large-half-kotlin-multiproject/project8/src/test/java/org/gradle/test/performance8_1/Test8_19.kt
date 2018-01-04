package org.gradle.test.performance8_1

import org.junit.Assert.*

class Test8_19 {
    private val production = Production8_19("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}