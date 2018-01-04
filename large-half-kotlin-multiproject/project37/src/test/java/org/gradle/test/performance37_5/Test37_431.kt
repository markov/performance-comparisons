package org.gradle.test.performance37_5

import org.junit.Assert.*

class Test37_431 {
    private val production = Production37_431("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}