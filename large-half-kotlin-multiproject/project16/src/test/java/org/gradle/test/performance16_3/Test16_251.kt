package org.gradle.test.performance16_3

import org.junit.Assert.*

class Test16_251 {
    private val production = Production16_251("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}