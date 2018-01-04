package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_153 {
    private val production = Production3_153("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}