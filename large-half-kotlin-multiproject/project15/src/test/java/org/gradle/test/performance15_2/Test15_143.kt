package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_143 {
    private val production = Production15_143("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}