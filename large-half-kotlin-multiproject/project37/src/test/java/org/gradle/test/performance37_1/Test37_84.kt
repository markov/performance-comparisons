package org.gradle.test.performance37_1

import org.junit.Assert.*

class Test37_84 {
    private val production = Production37_84("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}