package org.gradle.test.performance15_3

import org.junit.Assert.*

class Test15_240 {
    private val production = Production15_240("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}