package org.gradle.test.performance32_5

import org.junit.Assert.*

class Test32_406 {
    private val production = Production32_406("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}