package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_120 {
    private val production = Production3_120("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}