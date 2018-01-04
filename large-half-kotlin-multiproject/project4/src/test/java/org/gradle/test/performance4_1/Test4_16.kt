package org.gradle.test.performance4_1

import org.junit.Assert.*

class Test4_16 {
    private val production = Production4_16("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}