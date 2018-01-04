package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_105 {
    private val production = Production3_105("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}