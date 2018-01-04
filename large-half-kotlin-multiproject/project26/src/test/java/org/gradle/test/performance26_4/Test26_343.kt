package org.gradle.test.performance26_4

import org.junit.Assert.*

class Test26_343 {
    private val production = Production26_343("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}