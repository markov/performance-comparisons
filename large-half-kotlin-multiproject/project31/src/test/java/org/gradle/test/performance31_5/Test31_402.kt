package org.gradle.test.performance31_5

import org.junit.Assert.*

class Test31_402 {
    private val production = Production31_402("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}