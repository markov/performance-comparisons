package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_146 {
    private val production = Production26_146("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}