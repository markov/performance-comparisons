package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_408 {
    private val production = Production26_408("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}