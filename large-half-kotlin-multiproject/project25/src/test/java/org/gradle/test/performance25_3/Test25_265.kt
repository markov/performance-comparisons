package org.gradle.test.performance25_3

import org.junit.Assert.*

class Test25_265 {
    private val production = Production25_265("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}