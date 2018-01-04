package org.gradle.test.performance22_3

import org.junit.Assert.*

class Test22_214 {
    private val production = Production22_214("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}