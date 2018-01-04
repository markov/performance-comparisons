package org.gradle.test.performance22_3

import org.junit.Assert.*

class Test22_288 {
    private val production = Production22_288("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}