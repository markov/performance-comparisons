package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_346 {
    private val production = Production25_346("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}