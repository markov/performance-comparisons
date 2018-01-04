package org.gradle.test.performance4_5

import org.junit.Assert.*

class Test4_438 {
    private val production = Production4_438("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}