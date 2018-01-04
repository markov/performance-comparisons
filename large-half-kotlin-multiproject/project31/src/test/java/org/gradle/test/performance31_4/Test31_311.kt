package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_311 {
    private val production = Production31_311("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}