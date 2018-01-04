package org.gradle.test.performance50_3

import org.junit.Assert.*

class Test50_217 {
    private val production = Production50_217("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
