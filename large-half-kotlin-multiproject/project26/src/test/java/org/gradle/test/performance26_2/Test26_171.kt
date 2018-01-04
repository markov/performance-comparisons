package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_171 {
    private val production = Production26_171("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}