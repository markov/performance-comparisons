package org.gradle.test.performance31_5

import org.junit.Assert.*

class Test31_455 {
    private val production = Production31_455("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}