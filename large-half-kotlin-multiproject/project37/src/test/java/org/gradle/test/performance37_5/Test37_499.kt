package org.gradle.test.performance37_5

import org.junit.Assert.*

class Test37_499 {
    private val production = Production37_499("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}