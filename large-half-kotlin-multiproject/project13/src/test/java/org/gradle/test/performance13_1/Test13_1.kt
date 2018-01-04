package org.gradle.test.performance13_1

import org.junit.Assert.*

class Test13_1 {
    private val production = Production13_1("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}