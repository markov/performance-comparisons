package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_288 {
    private val production = Production3_288("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}