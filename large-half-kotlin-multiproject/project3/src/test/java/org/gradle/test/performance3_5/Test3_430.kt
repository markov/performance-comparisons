package org.gradle.test.performance3_5

import org.junit.Assert.*

class Test3_430 {
    private val production = Production3_430("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}