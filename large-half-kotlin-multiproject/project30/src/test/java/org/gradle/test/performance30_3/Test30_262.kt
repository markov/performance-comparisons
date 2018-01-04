package org.gradle.test.performance30_3

import org.junit.Assert.*

class Test30_262 {
    private val production = Production30_262("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}