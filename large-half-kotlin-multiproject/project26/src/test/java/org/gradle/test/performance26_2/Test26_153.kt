package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_153 {
    private val production = Production26_153("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}