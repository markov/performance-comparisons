package org.gradle.test.performance26_1

import org.junit.Assert.*

class Test26_20 {
    private val production = Production26_20("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}