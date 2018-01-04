package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_431 {
    private val production = Production26_431("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}