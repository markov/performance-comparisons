package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_386 {
    private val production = Production25_386("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}