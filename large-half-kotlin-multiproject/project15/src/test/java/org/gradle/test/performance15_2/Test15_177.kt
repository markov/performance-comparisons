package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_177 {
    private val production = Production15_177("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}