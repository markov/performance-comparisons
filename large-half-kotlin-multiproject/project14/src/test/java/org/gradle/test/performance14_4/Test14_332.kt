package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_332 {
    private val production = Production14_332("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}