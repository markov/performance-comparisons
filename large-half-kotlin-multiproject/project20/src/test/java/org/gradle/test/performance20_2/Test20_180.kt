package org.gradle.test.performance20_2

import org.junit.Assert.*

class Test20_180 {
    private val production = Production20_180("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}