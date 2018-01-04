package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_305 {
    private val production = Production25_305("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}