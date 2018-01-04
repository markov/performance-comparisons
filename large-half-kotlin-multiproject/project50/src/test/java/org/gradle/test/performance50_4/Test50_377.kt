package org.gradle.test.performance50_4

import org.junit.Assert.*

class Test50_377 {
    private val production = Production50_377("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
