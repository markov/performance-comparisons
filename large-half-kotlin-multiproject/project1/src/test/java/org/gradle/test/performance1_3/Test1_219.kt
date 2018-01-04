package org.gradle.test.performance1_3

import org.junit.Assert.*

class Test1_219 {
    private val production = Production1_219("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}