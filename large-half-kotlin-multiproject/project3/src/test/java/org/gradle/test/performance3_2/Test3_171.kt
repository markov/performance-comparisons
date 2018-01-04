package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_171 {
    private val production = Production3_171("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}