package org.gradle.test.performance20_2

import org.junit.Assert.*

class Test20_185 {
    private val production = Production20_185("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}