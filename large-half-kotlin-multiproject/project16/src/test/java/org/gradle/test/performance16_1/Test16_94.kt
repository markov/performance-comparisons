package org.gradle.test.performance16_1

import org.junit.Assert.*

class Test16_94 {
    private val production = Production16_94("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}