package org.gradle.test.performance50_3

import org.junit.Assert.*

class Test50_240 {
    private val production = Production50_240("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
