package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_302 {
    private val production = Production25_302("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}