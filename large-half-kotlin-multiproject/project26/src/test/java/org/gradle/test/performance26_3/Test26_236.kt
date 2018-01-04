package org.gradle.test.performance26_3

import org.junit.Assert.*

class Test26_236 {
    private val production = Production26_236("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}