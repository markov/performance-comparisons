package org.gradle.test.performance22_4

import org.junit.Assert.*

class Test22_334 {
    private val production = Production22_334("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}