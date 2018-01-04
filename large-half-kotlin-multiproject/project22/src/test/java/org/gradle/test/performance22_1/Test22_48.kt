package org.gradle.test.performance22_1

import org.junit.Assert.*

class Test22_48 {
    private val production = Production22_48("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}