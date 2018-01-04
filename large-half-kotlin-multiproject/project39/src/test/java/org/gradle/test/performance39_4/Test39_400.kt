package org.gradle.test.performance39_4

import org.junit.Assert.*

class Test39_400 {
    private val production = Production39_400("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}