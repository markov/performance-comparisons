package org.gradle.test.performance50_2

import org.junit.Assert.*

class Test50_181 {
    private val production = Production50_181("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
