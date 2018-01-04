package org.gradle.test.performance13_4

import org.junit.Assert.*

class Test13_309 {
    private val production = Production13_309("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}