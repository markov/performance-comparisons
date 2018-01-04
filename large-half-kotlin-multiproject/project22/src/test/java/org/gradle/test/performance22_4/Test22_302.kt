package org.gradle.test.performance22_4

import org.junit.Assert.*

class Test22_302 {
    private val production = Production22_302("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}