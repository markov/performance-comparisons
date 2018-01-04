package org.gradle.test.performance32_1

import org.junit.Assert.*

class Test32_84 {
    private val production = Production32_84("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}