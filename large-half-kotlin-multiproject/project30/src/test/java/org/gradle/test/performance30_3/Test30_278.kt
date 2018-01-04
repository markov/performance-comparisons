package org.gradle.test.performance30_3

import org.junit.Assert.*

class Test30_278 {
    private val production = Production30_278("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}