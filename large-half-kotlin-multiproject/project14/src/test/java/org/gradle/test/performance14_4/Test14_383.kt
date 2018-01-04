package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_383 {
    private val production = Production14_383("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}