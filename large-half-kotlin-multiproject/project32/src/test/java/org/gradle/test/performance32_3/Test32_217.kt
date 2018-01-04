package org.gradle.test.performance32_3

import org.junit.Assert.*

class Test32_217 {
    private val production = Production32_217("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}