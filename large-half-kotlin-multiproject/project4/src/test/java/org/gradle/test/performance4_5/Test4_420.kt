package org.gradle.test.performance4_5

import org.junit.Assert.*

class Test4_420 {
    private val production = Production4_420("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}