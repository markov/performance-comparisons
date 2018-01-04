package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_262 {
    private val production = Production14_262("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}