package org.gradle.test.performance31_5

import org.junit.Assert.*

class Test31_450 {
    private val production = Production31_450("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}