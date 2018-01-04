package org.gradle.test.performance50_5

import org.junit.Assert.*

class Test50_493 {
    private val production = Production50_493("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
