package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_265 {
    private val production = Production3_265("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}