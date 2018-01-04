package org.gradle.test.performance50_1

import org.junit.Assert.*

class Test50_75 {
    private val production = Production50_75("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
