package org.gradle.test.performance13_3

import org.junit.Assert.*

class Test13_293 {
    private val production = Production13_293("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}