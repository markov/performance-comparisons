package org.gradle.test.performance5_5

import org.junit.Assert.*

class Test5_408 {
    private val production = Production5_408("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}