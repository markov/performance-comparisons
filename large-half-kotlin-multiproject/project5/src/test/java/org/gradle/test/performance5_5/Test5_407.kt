package org.gradle.test.performance5_5

import org.junit.Assert.*

class Test5_407 {
    private val production = Production5_407("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}