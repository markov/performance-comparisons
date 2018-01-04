package org.gradle.test.performance7_3

import org.junit.Assert.*

class Test7_219 {
    private val production = Production7_219("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}