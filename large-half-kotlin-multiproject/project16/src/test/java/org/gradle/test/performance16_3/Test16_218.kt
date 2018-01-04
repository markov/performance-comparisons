package org.gradle.test.performance16_3

import org.junit.Assert.*

class Test16_218 {
    private val production = Production16_218("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}