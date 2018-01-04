package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_117 {
    private val production = Production30_117("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}