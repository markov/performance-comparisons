package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_148 {
    private val production = Production26_148("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}