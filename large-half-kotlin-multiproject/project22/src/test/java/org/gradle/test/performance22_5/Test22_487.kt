package org.gradle.test.performance22_5

import org.junit.Assert.*

class Test22_487 {
    private val production = Production22_487("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}