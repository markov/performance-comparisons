package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_222 {
    private val production = Production14_222("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}