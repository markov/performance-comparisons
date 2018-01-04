package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_365 {
    private val production = Production31_365("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}