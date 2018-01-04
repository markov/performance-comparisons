package org.gradle.test.performance22_5

import org.junit.Assert.*

class Test22_432 {
    private val production = Production22_432("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}