package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_478 {
    private val production = Production26_478("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}