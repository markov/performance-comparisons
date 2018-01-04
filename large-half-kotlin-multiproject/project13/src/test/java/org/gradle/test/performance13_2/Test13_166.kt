package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_166 {
    private val production = Production13_166("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}