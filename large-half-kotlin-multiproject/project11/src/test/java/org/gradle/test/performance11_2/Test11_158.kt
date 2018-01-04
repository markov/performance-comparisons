package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_158 {
    private val production = Production11_158("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}