package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_292 {
    private val production = Production14_292("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}