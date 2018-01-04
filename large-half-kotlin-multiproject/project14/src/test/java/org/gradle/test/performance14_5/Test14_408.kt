package org.gradle.test.performance14_5

import org.junit.Assert.*

class Test14_408 {
    private val production = Production14_408("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}