package org.gradle.test.performance3_5

import org.junit.Assert.*

class Test3_438 {
    private val production = Production3_438("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}