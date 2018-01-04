package org.gradle.test.performance39_2

import org.junit.Assert.*

class Test39_177 {
    private val production = Production39_177("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}