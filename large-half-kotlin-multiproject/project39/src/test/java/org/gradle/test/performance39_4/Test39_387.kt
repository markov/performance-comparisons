package org.gradle.test.performance39_4

import org.junit.Assert.*

class Test39_387 {
    private val production = Production39_387("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}