package org.gradle.test.performance15_1

import org.junit.Assert.*

class Test15_20 {
    private val production = Production15_20("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}