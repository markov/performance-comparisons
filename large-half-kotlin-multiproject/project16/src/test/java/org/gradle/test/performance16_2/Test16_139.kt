package org.gradle.test.performance16_2

import org.junit.Assert.*

class Test16_139 {
    private val production = Production16_139("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}