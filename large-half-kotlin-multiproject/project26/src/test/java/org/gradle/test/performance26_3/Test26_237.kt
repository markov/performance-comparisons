package org.gradle.test.performance26_3

import org.junit.Assert.*

class Test26_237 {
    private val production = Production26_237("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}