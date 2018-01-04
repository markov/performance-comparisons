package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_224 {
    private val production = Production14_224("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}