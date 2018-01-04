package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_250 {
    private val production = Production3_250("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}