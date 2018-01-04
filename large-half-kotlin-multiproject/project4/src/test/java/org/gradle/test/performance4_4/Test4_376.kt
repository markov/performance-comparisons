package org.gradle.test.performance4_4

import org.junit.Assert.*

class Test4_376 {
    private val production = Production4_376("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}