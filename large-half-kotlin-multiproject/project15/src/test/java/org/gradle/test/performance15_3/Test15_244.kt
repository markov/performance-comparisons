package org.gradle.test.performance15_3

import org.junit.Assert.*

class Test15_244 {
    private val production = Production15_244("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}