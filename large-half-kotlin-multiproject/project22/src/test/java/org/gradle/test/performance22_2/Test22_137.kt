package org.gradle.test.performance22_2

import org.junit.Assert.*

class Test22_137 {
    private val production = Production22_137("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}