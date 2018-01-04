package org.gradle.test.performance32_1

import org.junit.Assert.*

class Test32_55 {
    private val production = Production32_55("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}