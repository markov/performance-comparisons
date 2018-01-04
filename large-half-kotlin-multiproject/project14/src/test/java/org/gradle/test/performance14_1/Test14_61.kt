package org.gradle.test.performance14_1

import org.junit.Assert.*

class Test14_61 {
    private val production = Production14_61("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}