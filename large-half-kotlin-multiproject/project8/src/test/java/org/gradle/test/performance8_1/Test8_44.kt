package org.gradle.test.performance8_1

import org.junit.Assert.*

class Test8_44 {
    private val production = Production8_44("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}