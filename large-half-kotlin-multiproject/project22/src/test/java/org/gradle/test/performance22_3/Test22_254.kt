package org.gradle.test.performance22_3

import org.junit.Assert.*

class Test22_254 {
    private val production = Production22_254("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}