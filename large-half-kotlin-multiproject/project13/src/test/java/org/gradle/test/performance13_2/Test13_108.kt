package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_108 {
    private val production = Production13_108("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}