package org.gradle.test.performance22_5

import org.junit.Assert.*

class Test22_440 {
    private val production = Production22_440("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}