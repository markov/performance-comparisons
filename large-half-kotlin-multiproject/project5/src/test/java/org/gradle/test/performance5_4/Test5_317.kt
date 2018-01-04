package org.gradle.test.performance5_4

import org.junit.Assert.*

class Test5_317 {
    private val production = Production5_317("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}