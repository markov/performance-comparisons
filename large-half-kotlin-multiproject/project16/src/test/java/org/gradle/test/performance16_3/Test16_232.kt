package org.gradle.test.performance16_3

import org.junit.Assert.*

class Test16_232 {
    private val production = Production16_232("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}