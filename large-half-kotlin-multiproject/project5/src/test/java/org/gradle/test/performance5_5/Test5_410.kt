package org.gradle.test.performance5_5

import org.junit.Assert.*

class Test5_410 {
    private val production = Production5_410("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}