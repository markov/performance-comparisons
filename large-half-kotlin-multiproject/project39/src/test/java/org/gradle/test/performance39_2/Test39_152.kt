package org.gradle.test.performance39_2

import org.junit.Assert.*

class Test39_152 {
    private val production = Production39_152("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}