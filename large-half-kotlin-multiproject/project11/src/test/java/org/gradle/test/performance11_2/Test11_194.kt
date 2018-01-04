package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_194 {
    private val production = Production11_194("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}