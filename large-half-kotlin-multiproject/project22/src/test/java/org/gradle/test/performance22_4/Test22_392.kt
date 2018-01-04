package org.gradle.test.performance22_4

import org.junit.Assert.*

class Test22_392 {
    private val production = Production22_392("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}