package org.gradle.test.performance26_3

import org.junit.Assert.*

class Test26_232 {
    private val production = Production26_232("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}