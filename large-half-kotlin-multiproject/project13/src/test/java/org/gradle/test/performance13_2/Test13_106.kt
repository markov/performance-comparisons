package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_106 {
    private val production = Production13_106("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}