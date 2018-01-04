package org.gradle.test.performance22_4

import org.junit.Assert.*

class Test22_332 {
    private val production = Production22_332("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}