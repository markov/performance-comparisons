package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_136 {
    private val production = Production25_136("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}