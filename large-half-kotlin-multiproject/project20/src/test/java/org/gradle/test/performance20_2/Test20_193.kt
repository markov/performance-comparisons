package org.gradle.test.performance20_2

import org.junit.Assert.*

class Test20_193 {
    private val production = Production20_193("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}