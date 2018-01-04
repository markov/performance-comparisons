package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_342 {
    private val production = Production14_342("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}