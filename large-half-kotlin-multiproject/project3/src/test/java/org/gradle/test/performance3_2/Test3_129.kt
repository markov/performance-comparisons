package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_129 {
    private val production = Production3_129("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}