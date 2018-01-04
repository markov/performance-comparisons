package org.gradle.test.performance3_5

import org.junit.Assert.*

class Test3_478 {
    private val production = Production3_478("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}