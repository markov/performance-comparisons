package org.gradle.test.performance50_5

import org.junit.Assert.*

class Test50_474 {
    private val production = Production50_474("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
