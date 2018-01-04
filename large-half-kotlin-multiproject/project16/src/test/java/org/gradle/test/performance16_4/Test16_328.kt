package org.gradle.test.performance16_4

import org.junit.Assert.*

class Test16_328 {
    private val production = Production16_328("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}