package org.gradle.test.performance22_1

import org.junit.Assert.*

class Test22_46 {
    private val production = Production22_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}