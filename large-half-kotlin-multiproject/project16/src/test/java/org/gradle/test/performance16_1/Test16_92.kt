package org.gradle.test.performance16_1

import org.junit.Assert.*

class Test16_92 {
    private val production = Production16_92("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}