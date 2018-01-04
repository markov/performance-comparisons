package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_375 {
    private val production = Production14_375("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}