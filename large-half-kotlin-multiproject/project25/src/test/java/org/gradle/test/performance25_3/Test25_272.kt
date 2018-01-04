package org.gradle.test.performance25_3

import org.junit.Assert.*

class Test25_272 {
    private val production = Production25_272("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}