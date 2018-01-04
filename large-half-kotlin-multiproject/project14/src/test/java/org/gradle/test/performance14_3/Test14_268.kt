package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_268 {
    private val production = Production14_268("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}