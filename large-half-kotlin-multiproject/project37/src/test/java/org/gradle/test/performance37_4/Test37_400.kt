package org.gradle.test.performance37_4

import org.junit.Assert.*

class Test37_400 {
    private val production = Production37_400("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}