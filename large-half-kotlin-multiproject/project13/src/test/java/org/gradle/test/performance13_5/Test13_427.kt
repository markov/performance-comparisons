package org.gradle.test.performance13_5

import org.junit.Assert.*

class Test13_427 {
    private val production = Production13_427("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}