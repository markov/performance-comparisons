package org.gradle.test.performance32_3

import org.junit.Assert.*

class Test32_251 {
    private val production = Production32_251("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}