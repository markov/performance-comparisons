package org.gradle.test.performance3_5

import org.junit.Assert.*

class Test3_462 {
    private val production = Production3_462("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}