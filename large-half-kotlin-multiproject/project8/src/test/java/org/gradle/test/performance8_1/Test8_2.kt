package org.gradle.test.performance8_1

import org.junit.Assert.*

class Test8_2 {
    private val production = Production8_2("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}