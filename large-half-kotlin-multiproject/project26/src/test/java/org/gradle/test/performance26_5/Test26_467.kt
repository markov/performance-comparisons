package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_467 {
    private val production = Production26_467("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}