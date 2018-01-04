package org.gradle.test.performance31_1

import org.junit.Assert.*

class Test31_46 {
    private val production = Production31_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}