package org.gradle.test.performance4_3

import org.junit.Assert.*

class Test4_231 {
    private val production = Production4_231("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}