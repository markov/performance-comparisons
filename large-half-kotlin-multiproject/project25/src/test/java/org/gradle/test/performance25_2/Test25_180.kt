package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_180 {
    private val production = Production25_180("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}