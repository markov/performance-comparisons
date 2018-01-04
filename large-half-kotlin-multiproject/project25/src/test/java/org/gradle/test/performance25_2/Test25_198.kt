package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_198 {
    private val production = Production25_198("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}