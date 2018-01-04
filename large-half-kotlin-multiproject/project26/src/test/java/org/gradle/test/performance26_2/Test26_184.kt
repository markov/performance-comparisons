package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_184 {
    private val production = Production26_184("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}