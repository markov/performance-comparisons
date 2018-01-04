package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_305 {
    private val production = Production31_305("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}