package org.gradle.test.performance32_2

import org.junit.Assert.*

class Test32_190 {
    private val production = Production32_190("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}