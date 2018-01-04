package org.gradle.test.performance4_4

import org.junit.Assert.*

class Test4_340 {
    private val production = Production4_340("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}