package org.gradle.test.performance4_5

import org.junit.Assert.*

class Test4_478 {
    private val production = Production4_478("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}