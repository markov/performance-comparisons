package org.gradle.test.performance50_2

import org.junit.Assert.*

class Test50_137 {
    private val production = Production50_137("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
