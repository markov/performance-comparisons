package org.gradle.test.performance32_2

import org.junit.Assert.*

class Test32_168 {
    private val production = Production32_168("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}