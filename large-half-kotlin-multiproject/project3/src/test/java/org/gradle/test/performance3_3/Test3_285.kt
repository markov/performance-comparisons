package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_285 {
    private val production = Production3_285("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}