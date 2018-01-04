package org.gradle.test.performance31_1

import org.junit.Assert.*

class Test31_92 {
    private val production = Production31_92("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}