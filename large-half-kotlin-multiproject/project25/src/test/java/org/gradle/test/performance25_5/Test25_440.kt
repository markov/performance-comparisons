package org.gradle.test.performance25_5

import org.junit.Assert.*

class Test25_440 {
    private val production = Production25_440("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}