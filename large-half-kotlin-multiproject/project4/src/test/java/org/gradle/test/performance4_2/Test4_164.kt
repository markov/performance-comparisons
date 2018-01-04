package org.gradle.test.performance4_2

import org.junit.Assert.*

class Test4_164 {
    private val production = Production4_164("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}