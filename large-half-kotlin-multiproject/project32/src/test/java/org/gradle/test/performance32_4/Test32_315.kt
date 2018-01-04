package org.gradle.test.performance32_4

import org.junit.Assert.*

class Test32_315 {
    private val production = Production32_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}