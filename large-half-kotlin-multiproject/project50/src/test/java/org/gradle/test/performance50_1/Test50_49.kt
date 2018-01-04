package org.gradle.test.performance50_1

import org.junit.Assert.*

class Test50_49 {
    private val production = Production50_49("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
