package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_164 {
    private val production = Production25_164("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}