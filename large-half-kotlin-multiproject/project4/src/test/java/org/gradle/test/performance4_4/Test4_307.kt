package org.gradle.test.performance4_4

import org.junit.Assert.*

class Test4_307 {
    private val production = Production4_307("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}