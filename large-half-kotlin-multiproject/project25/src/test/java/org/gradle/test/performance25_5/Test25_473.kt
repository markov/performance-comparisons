package org.gradle.test.performance25_5

import org.junit.Assert.*

class Test25_473 {
    private val production = Production25_473("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}