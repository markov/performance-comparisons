package org.gradle.test.performance33_3

import org.junit.Assert.*

class Test33_262 {
    private val production = Production33_262("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}