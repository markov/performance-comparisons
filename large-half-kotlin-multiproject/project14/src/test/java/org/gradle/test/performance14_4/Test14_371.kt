package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_371 {
    private val production = Production14_371("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}