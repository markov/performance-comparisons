package org.gradle.test.performance50_5

import org.junit.Assert.*

class Test50_484 {
    private val production = Production50_484("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
