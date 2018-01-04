package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_243 {
    private val production = Production14_243("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}