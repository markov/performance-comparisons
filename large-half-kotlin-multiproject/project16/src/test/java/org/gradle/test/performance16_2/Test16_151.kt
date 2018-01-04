package org.gradle.test.performance16_2

import org.junit.Assert.*

class Test16_151 {
    private val production = Production16_151("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}