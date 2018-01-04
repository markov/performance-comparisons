package org.gradle.test.performance14_2

import org.junit.Assert.*

class Test14_132 {
    private val production = Production14_132("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}