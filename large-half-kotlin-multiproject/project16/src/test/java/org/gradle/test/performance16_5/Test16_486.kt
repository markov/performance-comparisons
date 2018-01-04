package org.gradle.test.performance16_5

import org.junit.Assert.*

class Test16_486 {
    private val production = Production16_486("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}