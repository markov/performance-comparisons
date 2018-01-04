package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_344 {
    private val production = Production31_344("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}