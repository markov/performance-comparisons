package org.gradle.test.performance4_3

import org.junit.Assert.*

class Test4_291 {
    private val production = Production4_291("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}