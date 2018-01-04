package org.gradle.test.performance32_2

import org.junit.Assert.*

class Test32_188 {
    private val production = Production32_188("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}