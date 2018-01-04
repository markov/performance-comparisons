package org.gradle.test.performance22_5

import org.junit.Assert.*

class Test22_492 {
    private val production = Production22_492("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}