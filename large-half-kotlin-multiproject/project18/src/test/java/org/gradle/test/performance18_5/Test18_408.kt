package org.gradle.test.performance18_5

import org.junit.Assert.*

class Test18_408 {
    private val production = Production18_408("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}