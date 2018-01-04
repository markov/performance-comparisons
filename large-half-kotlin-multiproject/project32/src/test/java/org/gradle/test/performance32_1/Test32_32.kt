package org.gradle.test.performance32_1

import org.junit.Assert.*

class Test32_32 {
    private val production = Production32_32("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}