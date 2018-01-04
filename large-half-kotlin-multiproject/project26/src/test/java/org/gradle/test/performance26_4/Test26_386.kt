package org.gradle.test.performance26_4

import org.junit.Assert.*

class Test26_386 {
    private val production = Production26_386("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}