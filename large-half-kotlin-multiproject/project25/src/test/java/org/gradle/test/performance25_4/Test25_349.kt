package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_349 {
    private val production = Production25_349("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}