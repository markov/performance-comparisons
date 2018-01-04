package org.gradle.test.performance15_3

import org.junit.Assert.*

class Test15_218 {
    private val production = Production15_218("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}