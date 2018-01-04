package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_332 {
    private val production = Production25_332("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}