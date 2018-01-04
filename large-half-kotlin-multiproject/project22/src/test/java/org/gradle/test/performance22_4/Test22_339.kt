package org.gradle.test.performance22_4

import org.junit.Assert.*

class Test22_339 {
    private val production = Production22_339("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}