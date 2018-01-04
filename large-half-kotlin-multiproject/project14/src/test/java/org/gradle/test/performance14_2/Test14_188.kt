package org.gradle.test.performance14_2

import org.junit.Assert.*

class Test14_188 {
    private val production = Production14_188("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}