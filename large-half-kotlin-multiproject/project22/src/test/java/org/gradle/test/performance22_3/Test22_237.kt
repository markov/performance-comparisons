package org.gradle.test.performance22_3

import org.junit.Assert.*

class Test22_237 {
    private val production = Production22_237("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}