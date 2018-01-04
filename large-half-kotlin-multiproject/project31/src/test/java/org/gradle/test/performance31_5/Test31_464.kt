package org.gradle.test.performance31_5

import org.junit.Assert.*

class Test31_464 {
    private val production = Production31_464("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}