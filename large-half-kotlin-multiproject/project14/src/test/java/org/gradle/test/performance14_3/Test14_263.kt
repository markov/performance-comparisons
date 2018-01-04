package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_263 {
    private val production = Production14_263("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}