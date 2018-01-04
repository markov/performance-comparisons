package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_344 {
    private val production = Production25_344("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}