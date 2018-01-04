package org.gradle.test.performance22_2

import org.junit.Assert.*

class Test22_192 {
    private val production = Production22_192("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}