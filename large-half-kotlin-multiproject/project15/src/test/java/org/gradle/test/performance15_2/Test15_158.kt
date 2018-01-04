package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_158 {
    private val production = Production15_158("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}