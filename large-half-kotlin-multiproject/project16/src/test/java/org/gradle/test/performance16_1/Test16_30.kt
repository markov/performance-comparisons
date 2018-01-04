package org.gradle.test.performance16_1

import org.junit.Assert.*

class Test16_30 {
    private val production = Production16_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}