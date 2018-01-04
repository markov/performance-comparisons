package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_304 {
    private val production = Production14_304("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}