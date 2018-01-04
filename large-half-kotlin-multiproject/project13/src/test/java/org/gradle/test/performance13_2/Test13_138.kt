package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_138 {
    private val production = Production13_138("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}