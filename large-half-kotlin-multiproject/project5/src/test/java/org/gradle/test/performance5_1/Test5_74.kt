package org.gradle.test.performance5_1

import org.junit.Assert.*

class Test5_74 {
    private val production = Production5_74("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}