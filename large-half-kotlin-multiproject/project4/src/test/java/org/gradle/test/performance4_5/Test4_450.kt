package org.gradle.test.performance4_5

import org.junit.Assert.*

class Test4_450 {
    private val production = Production4_450("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}