package org.gradle.test.performance4_5

import org.junit.Assert.*

class Test4_441 {
    private val production = Production4_441("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}