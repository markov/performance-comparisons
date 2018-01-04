package org.gradle.test.performance37_3

import org.junit.Assert.*

class Test37_232 {
    private val production = Production37_232("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}