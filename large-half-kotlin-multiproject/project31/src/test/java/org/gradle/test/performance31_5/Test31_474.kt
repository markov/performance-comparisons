package org.gradle.test.performance31_5

import org.junit.Assert.*

class Test31_474 {
    private val production = Production31_474("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}