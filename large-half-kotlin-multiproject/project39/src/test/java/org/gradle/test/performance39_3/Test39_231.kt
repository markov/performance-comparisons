package org.gradle.test.performance39_3

import org.junit.Assert.*

class Test39_231 {
    private val production = Production39_231("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}