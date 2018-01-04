package org.gradle.test.performance39_2

import org.junit.Assert.*

class Test39_148 {
    private val production = Production39_148("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}