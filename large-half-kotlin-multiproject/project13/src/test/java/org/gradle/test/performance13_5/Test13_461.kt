package org.gradle.test.performance13_5

import org.junit.Assert.*

class Test13_461 {
    private val production = Production13_461("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}