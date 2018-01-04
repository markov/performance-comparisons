package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_277 {
    private val production = Production14_277("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}