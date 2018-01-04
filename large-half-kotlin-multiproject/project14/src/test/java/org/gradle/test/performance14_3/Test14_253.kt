package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_253 {
    private val production = Production14_253("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}