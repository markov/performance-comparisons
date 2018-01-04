package org.gradle.test.performance15_1

import org.junit.Assert.*

class Test15_24 {
    private val production = Production15_24("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}