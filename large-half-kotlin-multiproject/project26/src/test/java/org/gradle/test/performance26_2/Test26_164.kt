package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_164 {
    private val production = Production26_164("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}