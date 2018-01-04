package org.gradle.test.performance50_2

import org.junit.Assert.*

class Test50_197 {
    private val production = Production50_197("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
