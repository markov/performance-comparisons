package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_261 {
    private val production = Production14_261("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}