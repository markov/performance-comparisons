package org.gradle.test.performance32_2

import org.junit.Assert.*

class Test32_191 {
    private val production = Production32_191("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}