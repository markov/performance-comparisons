package org.gradle.test.performance20_1

import org.junit.Assert.*

class Test20_94 {
    private val production = Production20_94("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}