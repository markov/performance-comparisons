package org.gradle.test.performance39_1

import org.junit.Assert.*

class Test39_16 {
    private val production = Production39_16("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}