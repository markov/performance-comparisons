package org.gradle.test.performance31_5

import org.junit.Assert.*

class Test31_412 {
    private val production = Production31_412("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}