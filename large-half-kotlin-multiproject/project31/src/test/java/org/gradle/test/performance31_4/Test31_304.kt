package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_304 {
    private val production = Production31_304("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}