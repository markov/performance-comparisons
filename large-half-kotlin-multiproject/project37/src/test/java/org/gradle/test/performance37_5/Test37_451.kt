package org.gradle.test.performance37_5

import org.junit.Assert.*

class Test37_451 {
    private val production = Production37_451("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}