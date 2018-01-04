package org.gradle.test.performance32_4

import org.junit.Assert.*

class Test32_335 {
    private val production = Production32_335("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}