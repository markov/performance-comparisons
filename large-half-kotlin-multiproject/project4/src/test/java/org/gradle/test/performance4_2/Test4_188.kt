package org.gradle.test.performance4_2

import org.junit.Assert.*

class Test4_188 {
    private val production = Production4_188("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}