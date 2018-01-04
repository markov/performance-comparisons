package org.gradle.test.performance32_4

import org.junit.Assert.*

class Test32_345 {
    private val production = Production32_345("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}