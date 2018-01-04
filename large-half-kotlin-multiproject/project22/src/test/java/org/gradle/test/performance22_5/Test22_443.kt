package org.gradle.test.performance22_5

import org.junit.Assert.*

class Test22_443 {
    private val production = Production22_443("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}