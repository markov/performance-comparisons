package org.gradle.test.performance32_3

import org.junit.Assert.*

class Test32_271 {
    private val production = Production32_271("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}