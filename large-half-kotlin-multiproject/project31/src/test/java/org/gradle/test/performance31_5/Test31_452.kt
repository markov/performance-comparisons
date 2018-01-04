package org.gradle.test.performance31_5

import org.junit.Assert.*

class Test31_452 {
    private val production = Production31_452("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}