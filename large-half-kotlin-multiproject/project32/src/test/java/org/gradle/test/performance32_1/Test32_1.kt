package org.gradle.test.performance32_1

import org.junit.Assert.*

class Test32_1 {
    private val production = Production32_1("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}