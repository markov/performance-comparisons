package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_141 {
    private val production = Production3_141("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}