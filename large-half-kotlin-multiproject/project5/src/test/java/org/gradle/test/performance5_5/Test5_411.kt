package org.gradle.test.performance5_5

import org.junit.Assert.*

class Test5_411 {
    private val production = Production5_411("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}