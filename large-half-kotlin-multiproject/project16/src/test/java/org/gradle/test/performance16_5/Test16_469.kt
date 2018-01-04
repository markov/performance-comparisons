package org.gradle.test.performance16_5

import org.junit.Assert.*

class Test16_469 {
    private val production = Production16_469("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}