package org.gradle.test.performance32_2

import org.junit.Assert.*

class Test32_117 {
    private val production = Production32_117("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}