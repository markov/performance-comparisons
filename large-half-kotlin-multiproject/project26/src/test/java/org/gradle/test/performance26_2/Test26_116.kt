package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_116 {
    private val production = Production26_116("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}