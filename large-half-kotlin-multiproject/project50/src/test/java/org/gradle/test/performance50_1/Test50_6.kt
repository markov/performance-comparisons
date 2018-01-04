package org.gradle.test.performance50_1

import org.junit.Assert.*

class Test50_6 {
    private val production = Production50_6("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
