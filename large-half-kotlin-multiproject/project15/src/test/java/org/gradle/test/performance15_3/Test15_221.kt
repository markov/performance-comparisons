package org.gradle.test.performance15_3

import org.junit.Assert.*

class Test15_221 {
    private val production = Production15_221("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}