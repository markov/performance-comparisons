package org.gradle.test.performance30_3

import org.junit.Assert.*

class Test30_250 {
    private val production = Production30_250("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}