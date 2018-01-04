package org.gradle.test.performance26_1

import org.junit.Assert.*

class Test26_83 {
    private val production = Production26_83("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}