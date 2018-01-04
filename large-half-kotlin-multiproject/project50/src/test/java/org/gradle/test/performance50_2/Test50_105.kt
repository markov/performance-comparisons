package org.gradle.test.performance50_2

import org.junit.Assert.*

class Test50_105 {
    private val production = Production50_105("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
