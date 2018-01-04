package org.gradle.test.performance50_5

import org.junit.Assert.*

class Test50_434 {
    private val production = Production50_434("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
