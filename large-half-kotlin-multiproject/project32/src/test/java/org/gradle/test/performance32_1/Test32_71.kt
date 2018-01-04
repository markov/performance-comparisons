package org.gradle.test.performance32_1

import org.junit.Assert.*

class Test32_71 {
    private val production = Production32_71("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}