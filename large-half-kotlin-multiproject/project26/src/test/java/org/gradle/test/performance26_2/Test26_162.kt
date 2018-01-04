package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_162 {
    private val production = Production26_162("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}