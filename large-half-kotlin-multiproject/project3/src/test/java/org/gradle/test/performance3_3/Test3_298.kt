package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_298 {
    private val production = Production3_298("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}