package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_251 {
    private val production = Production14_251("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}