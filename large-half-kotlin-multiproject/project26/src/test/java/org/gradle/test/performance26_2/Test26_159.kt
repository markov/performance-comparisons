package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_159 {
    private val production = Production26_159("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}