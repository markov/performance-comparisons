package org.gradle.test.performance32_4

import org.junit.Assert.*

class Test32_351 {
    private val production = Production32_351("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}