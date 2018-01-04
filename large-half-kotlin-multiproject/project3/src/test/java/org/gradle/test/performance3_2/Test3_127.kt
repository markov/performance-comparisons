package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_127 {
    private val production = Production3_127("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}