package org.gradle.test.performance39_1

import org.junit.Assert.*

class Test39_20 {
    private val production = Production39_20("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}