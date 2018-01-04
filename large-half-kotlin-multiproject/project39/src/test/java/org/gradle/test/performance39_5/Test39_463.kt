package org.gradle.test.performance39_5

import org.junit.Assert.*

class Test39_463 {
    private val production = Production39_463("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}