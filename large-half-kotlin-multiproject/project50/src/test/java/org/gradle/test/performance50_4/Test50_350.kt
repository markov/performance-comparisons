package org.gradle.test.performance50_4

import org.junit.Assert.*

class Test50_350 {
    private val production = Production50_350("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
