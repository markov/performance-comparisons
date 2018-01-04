package org.gradle.test.performance22_2

import org.junit.Assert.*

class Test22_124 {
    private val production = Production22_124("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}