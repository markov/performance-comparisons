package org.gradle.test.performance22_3

import org.junit.Assert.*

class Test22_205 {
    private val production = Production22_205("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}