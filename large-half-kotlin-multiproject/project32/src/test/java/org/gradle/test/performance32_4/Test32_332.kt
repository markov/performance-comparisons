package org.gradle.test.performance32_4

import org.junit.Assert.*

class Test32_332 {
    private val production = Production32_332("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}