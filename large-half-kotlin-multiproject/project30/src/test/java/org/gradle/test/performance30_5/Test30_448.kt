package org.gradle.test.performance30_5

import org.junit.Assert.*

class Test30_448 {
    private val production = Production30_448("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}