package org.gradle.test.performance37_3

import org.junit.Assert.*

class Test37_214 {
    private val production = Production37_214("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}