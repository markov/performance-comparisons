package org.gradle.test.performance25_1

import org.junit.Assert.*

class Test25_52 {
    private val production = Production25_52("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}