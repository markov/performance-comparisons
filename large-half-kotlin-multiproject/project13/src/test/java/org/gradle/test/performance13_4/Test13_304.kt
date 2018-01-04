package org.gradle.test.performance13_4

import org.junit.Assert.*

class Test13_304 {
    private val production = Production13_304("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}