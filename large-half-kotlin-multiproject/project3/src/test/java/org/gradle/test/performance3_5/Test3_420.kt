package org.gradle.test.performance3_5

import org.junit.Assert.*

class Test3_420 {
    private val production = Production3_420("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}