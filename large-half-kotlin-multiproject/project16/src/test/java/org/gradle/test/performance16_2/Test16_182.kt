package org.gradle.test.performance16_2

import org.junit.Assert.*

class Test16_182 {
    private val production = Production16_182("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}