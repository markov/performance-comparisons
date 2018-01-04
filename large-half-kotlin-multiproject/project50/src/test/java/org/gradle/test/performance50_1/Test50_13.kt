package org.gradle.test.performance50_1

import org.junit.Assert.*

class Test50_13 {
    private val production = Production50_13("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
