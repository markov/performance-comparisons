package org.gradle.test.performance13_4

import org.junit.Assert.*

class Test13_323 {
    private val production = Production13_323("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}