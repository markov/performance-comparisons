package org.gradle.test.performance13_3

import org.junit.Assert.*

class Test13_241 {
    private val production = Production13_241("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}