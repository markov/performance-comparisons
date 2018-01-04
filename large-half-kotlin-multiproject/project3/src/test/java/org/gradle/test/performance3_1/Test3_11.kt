package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_11 {
    private val production = Production3_11("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}