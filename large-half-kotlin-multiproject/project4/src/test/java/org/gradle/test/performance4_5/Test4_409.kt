package org.gradle.test.performance4_5

import org.junit.Assert.*

class Test4_409 {
    private val production = Production4_409("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}