package org.gradle.test.performance31_2

import org.junit.Assert.*

class Test31_136 {
    private val production = Production31_136("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}