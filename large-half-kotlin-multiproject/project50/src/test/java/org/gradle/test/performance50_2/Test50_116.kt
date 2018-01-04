package org.gradle.test.performance50_2

import org.junit.Assert.*

class Test50_116 {
    private val production = Production50_116("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
