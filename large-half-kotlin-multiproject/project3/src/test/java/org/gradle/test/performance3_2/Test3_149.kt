package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_149 {
    private val production = Production3_149("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}