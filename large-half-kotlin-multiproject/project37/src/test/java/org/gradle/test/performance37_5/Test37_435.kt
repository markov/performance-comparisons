package org.gradle.test.performance37_5

import org.junit.Assert.*

class Test37_435 {
    private val production = Production37_435("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}