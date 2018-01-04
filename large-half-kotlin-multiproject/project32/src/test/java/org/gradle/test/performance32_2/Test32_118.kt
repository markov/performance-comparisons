package org.gradle.test.performance32_2

import org.junit.Assert.*

class Test32_118 {
    private val production = Production32_118("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}