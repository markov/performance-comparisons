package org.gradle.test.performance16_3

import org.junit.Assert.*

class Test16_202 {
    private val production = Production16_202("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}