package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_367 {
    private val production = Production31_367("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}