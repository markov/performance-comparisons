package org.gradle.test.performance33_3

import org.junit.Assert.*

class Test33_219 {
    private val production = Production33_219("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}