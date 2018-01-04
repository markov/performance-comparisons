package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_288 {
    private val production = Production14_288("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}