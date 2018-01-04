package org.gradle.test.performance16_5

import org.junit.Assert.*

class Test16_411 {
    private val production = Production16_411("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}