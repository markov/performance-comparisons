package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_470 {
    private val production = Production26_470("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}