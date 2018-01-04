package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_20 {
    private val production = Production3_20("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}