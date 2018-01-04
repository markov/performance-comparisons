package org.gradle.test.performance39_5

import org.junit.Assert.*

class Test39_455 {
    private val production = Production39_455("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}