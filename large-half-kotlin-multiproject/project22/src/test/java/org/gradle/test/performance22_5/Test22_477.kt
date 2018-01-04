package org.gradle.test.performance22_5

import org.junit.Assert.*

class Test22_477 {
    private val production = Production22_477("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}