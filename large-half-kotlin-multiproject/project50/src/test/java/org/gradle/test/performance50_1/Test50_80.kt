package org.gradle.test.performance50_1

import org.junit.Assert.*

class Test50_80 {
    private val production = Production50_80("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
