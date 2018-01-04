package org.gradle.test.performance22_1

import org.junit.Assert.*

class Test22_18 {
    private val production = Production22_18("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}