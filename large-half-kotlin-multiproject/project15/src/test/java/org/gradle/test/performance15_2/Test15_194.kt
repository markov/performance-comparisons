package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_194 {
    private val production = Production15_194("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}