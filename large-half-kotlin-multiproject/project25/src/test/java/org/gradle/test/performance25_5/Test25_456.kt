package org.gradle.test.performance25_5

import org.junit.Assert.*

class Test25_456 {
    private val production = Production25_456("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}