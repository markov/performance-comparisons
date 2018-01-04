package org.gradle.test.performance8_2

import org.junit.Assert.*

class Test8_134 {
    private val production = Production8_134("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}