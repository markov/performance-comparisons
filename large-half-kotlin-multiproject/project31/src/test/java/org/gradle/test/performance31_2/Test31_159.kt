package org.gradle.test.performance31_2

import org.junit.Assert.*

class Test31_159 {
    private val production = Production31_159("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}