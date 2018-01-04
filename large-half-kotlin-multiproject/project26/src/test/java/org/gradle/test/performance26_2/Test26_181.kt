package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_181 {
    private val production = Production26_181("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}