package org.gradle.test.performance25_1

import org.junit.Assert.*

class Test25_23 {
    private val production = Production25_23("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}