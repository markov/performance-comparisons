package org.gradle.test.performance22_3

import org.junit.Assert.*

class Test22_206 {
    private val production = Production22_206("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}