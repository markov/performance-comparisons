package org.gradle.test.performance5_1

import org.junit.Assert.*

class Test5_63 {
    private val production = Production5_63("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}