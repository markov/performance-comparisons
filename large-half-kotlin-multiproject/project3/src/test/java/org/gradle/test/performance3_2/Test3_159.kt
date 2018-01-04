package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_159 {
    private val production = Production3_159("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}