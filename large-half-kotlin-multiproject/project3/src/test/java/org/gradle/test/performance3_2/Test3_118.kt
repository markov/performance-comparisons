package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_118 {
    private val production = Production3_118("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}