package org.gradle.test.performance37_5

import org.junit.Assert.*

class Test37_469 {
    private val production = Production37_469("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}