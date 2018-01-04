package org.gradle.test.performance16_2

import org.junit.Assert.*

class Test16_167 {
    private val production = Production16_167("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}