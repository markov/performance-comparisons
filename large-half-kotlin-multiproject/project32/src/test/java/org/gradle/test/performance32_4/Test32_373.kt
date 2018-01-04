package org.gradle.test.performance32_4

import org.junit.Assert.*

class Test32_373 {
    private val production = Production32_373("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}