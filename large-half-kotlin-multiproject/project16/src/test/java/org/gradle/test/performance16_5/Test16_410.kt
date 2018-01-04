package org.gradle.test.performance16_5

import org.junit.Assert.*

class Test16_410 {
    private val production = Production16_410("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}