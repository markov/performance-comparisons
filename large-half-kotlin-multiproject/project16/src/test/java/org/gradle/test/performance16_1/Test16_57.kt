package org.gradle.test.performance16_1

import org.junit.Assert.*

class Test16_57 {
    private val production = Production16_57("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}